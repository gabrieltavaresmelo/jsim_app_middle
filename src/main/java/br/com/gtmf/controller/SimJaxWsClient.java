package br.com.gtmf.controller;

import br.com.gtmf.wsdl.SimInterfaceImpl;
import br.com.gtmf.wsdl.SimInterfaceImplService;

/**
 * Classe responsavel por fazer o "meio de campo" entre o Servidor Corba
 * (SimCorbaServer) e a classe publicadora do Servico Web (JAX-WS).
 * 
 * @author Gabriel Tavares
 * 
 */
public class SimJaxWsClient {

	private static SimJaxWsClient instance = null;

	private SimInterfaceImplService simService;
	private SimInterfaceImpl simInterface;

	public SimJaxWsClient() {
		simService = new SimInterfaceImplService();
		simInterface = simService.getSimInterfaceImplPort();
	}

	public static SimJaxWsClient getInstance() {
		if (instance == null) {
			instance = new SimJaxWsClient();
		}
		return instance;
	}

	public String login(String nickname) {
		return simInterface.login(nickname);
	}

	public String logout(String nickname) {
		return simInterface.logout(nickname);
	}

	public String startRadar(String nickname, String location) {
		return simInterface.startRadar(nickname, location);
	}

	public String stopRadar(String nickname) {
		return simInterface.stopRadar(nickname);
	}

	public String write(String from, String message) {
		return simInterface.write(from, message);
	}

	public String writeTo(String from, String to, String message) {
		return simInterface.writeTo(from, to, message);
	}

	public String changeLocation(String nickname, String location) {
		return simInterface.changeLocation(nickname, location);
	}

	public String listNearlyClients(String nickname) {
		return simInterface.listNearlyClients(nickname);
	}

	public String addRoom(String roomName) {
		return simInterface.addRoom(roomName);
	}

	public String getRoom(String clientName){
		return simInterface.getRoom(clientName);
	}

	public String listRooms() {
		return simInterface.listRooms();
	}

	public String changeClientRoom(String clientName, String roomName) {
		return simInterface.changeClientRoom(clientName, roomName);
	}
}
