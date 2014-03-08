package br.com.gtmf.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import sim.AnonymID;
import sim.SimCorbaClient;
import sim.UserExists;
import br.com.gtmf.model.Bundle;

public class SimCorbaServer extends sim.SimCorbaServerPOA{
	
	/**
	 *  Mantem uma referencia dos clientes que estao conectados
	 *  para estabelecer a conexao entre os clientes corba. 
	 */
	protected Map<String, CorbaClient> clients = new HashMap<String, CorbaClient>();

	/**
	 * Recebe a notificacao de que um novo usuario entrou no bate-papo
	 * e manda a lista com todos os clientes conectados para os usuarios
	 *  
	 * @param nickname
	 * @return error | nickname
	 */
	@Override
	public String login(String nickname, SimCorbaClient client) throws UserExists {
		
		String respRoom = SimJaxWsClient.getInstance().login(nickname);
		
		if(respRoom != null && respRoom.equalsIgnoreCase("error")){
			throw new sim.UserExists();				
		}
		
		CorbaClient newClient = new CorbaClient(nickname, client);
		clients.put(nickname, newClient);
		
		return respRoom;
	}
	
	/**
	 * Recebe a notificacao de que um usuario saiu do bate-papo
	 * e manda a lista com todos os clientes conectados para os usuarios
	 * 
	 * @param nickname
	 * @return error | nickname
	 */
	@Override
	public void logout(String nickname) throws AnonymID {
		try {
			String resp = SimJaxWsClient.getInstance().logout(nickname);
			
			if(resp != null && resp.equalsIgnoreCase("error")){
				throw new sim.AnonymID();				
			}
			
			// Remove da lista local
			CorbaClient client = clients.remove(nickname);
			
			if(client == null){
				throw new sim.AnonymID();				
			}
			
			// Envia a lista de 
			Collection<CorbaClient> tmpUsersON = clients.values();
			
			for (CorbaClient to : tmpUsersON) {
				String toSend = Bundle.toJson(new Bundle(Bundle.CHANGE_USER_LOCATION, nickname));
				
				if(to.getClient() != null){
					to.getClient().update(toSend);
				}
			}
	
	//		System.out.println("REMOVED: " + nickname);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}	
	}

	@Override
	public void startRadar(String nickname, String location) {
		
		String added = SimJaxWsClient.getInstance().startRadar(nickname, location);
		
		if(added != null && added.equalsIgnoreCase("error")){
//			System.out.println("Erro ao iniciar o radar: " + nickname + " " + location);
		}
		
	}

	@Override
	public void stopRadar(String nickname) {
		
		String added = SimJaxWsClient.getInstance().stopRadar(nickname);
		
		if(added != null && added.equalsIgnoreCase("error")){
//			System.out.println("Erro ao parar o radar: " + nickname);
		}
		
	}

	@Override
	public void write(String from, String text) throws AnonymID {
		try {
			String resp = SimJaxWsClient.getInstance().write(from, text);
			
			CorbaClient fromCorbaClient = clients.get(from);
			
			if((resp != null && resp.equalsIgnoreCase("error")) || 
					fromCorbaClient == null){
				
//				System.out.println("Erro ao enviar mensagem geral");
				throw new sim.AnonymID();
			}
			
			// Manda somente para os clientes que estao na mesma sala
			String fromRoom = SimJaxWsClient.getInstance().getRoom(from);
			
			if(fromRoom != null && fromRoom.equalsIgnoreCase("error")){			
//				System.out.println("Erro ao obter as salas!");
				throw new sim.AnonymID();
			}
					
			for (CorbaClient to : clients.values()) {
				String toRoom = SimJaxWsClient.getInstance().getRoom(to.getNickname());
				
				if(toRoom != null && toRoom.equalsIgnoreCase("error")){			
//					System.out.println("Erro ao obter as salas!");
					throw new sim.AnonymID();
				}
				
				if(toRoom.equalsIgnoreCase(fromRoom)){
	//				System.out.println(text);// DEBUG				
					to.getClient().update(text);
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}		
	}

	@Override
	public void writeTo(String from, String to, String message) throws AnonymID {
		try {
			String resp = SimJaxWsClient.getInstance().writeTo(from, to, message);
			
			CorbaClient fromCorbaClient = clients.get(from);		
			CorbaClient toCorbaClient = clients.get(to);
			
			if((resp != null && resp.equalsIgnoreCase("error")) || 
					fromCorbaClient == null || toCorbaClient == null){

//				System.out.println("Erro ao enviar mensagem privada");
				throw new sim.AnonymID();
			}
			
//			System.out.println(message);// DEBUG
			toCorbaClient.getClient().update(message);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}	
	}

	/**
	 * Quando o usuario mudar sua localizacao
	 * todos os outros usuarios serao avisados
	 * e farao uma nova requisicao para ver os 
	 * clientes proximos.
	 * 
	 * Este metodo notificara a todos os usuarios
	 * que houve mudanca.
	 */
	@Override
	public String changeLocation(String nickname, String location) {
		String toReturn = "";
		
		try {
			String resp = SimJaxWsClient.getInstance().changeLocation(nickname, location);
			
			CorbaClient corbaClient = clients.get(nickname);
			
			if((resp != null && resp.equalsIgnoreCase("error")) || 
					corbaClient == null){
				
				System.out.println("Erro ao mudar a localização");
				return "";
			}
			
							
			toReturn = Bundle.toJson(new Bundle(Bundle.LIST_USERS_ON, resp));
			
			Collection<CorbaClient> tmpUsersON = clients.values();
			
			for (CorbaClient to : tmpUsersON) {
				String toSend = Bundle.toJson(new Bundle(Bundle.CHANGE_USER_LOCATION, nickname));
//						System.out.println("change: " + toSend); // DEBUG
				
				if(to.getClient() != null){
					to.getClient().update(toSend);
				}
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return toReturn;
	}

	@Override
	public String listNearlyClients(String nickname) {		
		try {
			String resp = SimJaxWsClient.getInstance().listNearlyClients(nickname);
			
			CorbaClient corbaClient = clients.get(nickname);
			
			if((resp != null && resp.equalsIgnoreCase("error")) || 
					corbaClient == null){
				
//				System.out.println("Erro ao obter os clientes mais próximos!");
				return "";
			}
		
			Bundle bundle = new Bundle(Bundle.LIST_USERS_ON, resp);
			String toSend = Bundle.toJson(bundle);
//			System.out.println("listNearlyClients: " + toSend);// DEBUG
			
			return toSend;
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return "";
	}

	@Override
	public String addRoom(String roomName) {
		try {
			String resp = SimJaxWsClient.getInstance().addRoom(roomName);
			
			if(resp != null && resp.equalsIgnoreCase("error")){			
//				System.out.println("Erro ao obter as salas!");
				return "";
			}
			
			// Manda para todos os clientes que a sala foi adicionada
			Bundle bundle = new Bundle(Bundle.LIST_ROOMS, resp);
			String toSend = Bundle.toJson(bundle);
//			System.out.println("listNearlyClients: " + toSend);// DEBUG
					
			for (CorbaClient to : clients.values()) {
//				System.out.println(text);// DEBUG
				to.getClient().update(toSend);
			}
			
			return toSend;
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return "";
	}

	@Override
	public String getRoom(String clienteName) {
		try {
			String resp = SimJaxWsClient.getInstance().getRoom(clienteName);
			
			if(resp != null && resp.equalsIgnoreCase("error")){			
//				System.out.println("Erro ao obter as salas!");
				return "";
			}
			
			return resp;
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return "";
	}

	@Override
	public String listRooms() {
		try {
			String resp = SimJaxWsClient.getInstance().listRooms();
			
			if(resp != null && resp.equalsIgnoreCase("error")){			
//				System.out.println("Erro ao obter as salas!");
				return "";
			}
			
			Bundle bundle = new Bundle(Bundle.LIST_ROOMS, resp);
			String toSend = Bundle.toJson(bundle);
//			System.out.println("listNearlyClients: " + toSend);// DEBUG
					
			for (CorbaClient to : clients.values()) {
//				System.out.println(text);// DEBUG
				to.getClient().update(toSend);
			}
			
			return toSend;
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return "";
	}

	@Override
	public String changeClientRoom(String clientName, String roomName) {
		try {
			String respNearlyClients = SimJaxWsClient.getInstance().changeClientRoom(clientName, roomName);
			
			if(respNearlyClients != null && respNearlyClients.equalsIgnoreCase("error")){			
//				System.out.println("Erro ao obter mudar o cliente de sala!");
				return "";
			}
			
//			String toReturn = Bundle.toJson(new Bundle(Bundle.LIST_USERS_ON, respNearlyClients));
			String toSend = Bundle.toJson(new Bundle(Bundle.CHANGE_USER_LOCATION, clientName));
//			System.out.println("change: " + toSend); // DEBUG
			
			Collection<CorbaClient> tmpUsersON = clients.values();
			
			for (CorbaClient to : tmpUsersON) {				
				if(to.getClient() != null){
					to.getClient().update(toSend);
				}
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return "";
	}
}
