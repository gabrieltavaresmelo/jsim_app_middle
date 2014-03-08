
package br.com.gtmf.wsdl;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "SimInterfaceImpl", targetNamespace = "http://gtmf.com.br/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface SimInterfaceImpl {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "login", targetNamespace = "http://gtmf.com.br/", className = "br.com.gtmf.wsdl.Login")
    @ResponseWrapper(localName = "loginResponse", targetNamespace = "http://gtmf.com.br/", className = "br.com.gtmf.wsdl.LoginResponse")
    @Action(input = "http://gtmf.com.br/SimInterfaceImpl/loginRequest", output = "http://gtmf.com.br/SimInterfaceImpl/loginResponse")
    public String login(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "logout", targetNamespace = "http://gtmf.com.br/", className = "br.com.gtmf.wsdl.Logout")
    @ResponseWrapper(localName = "logoutResponse", targetNamespace = "http://gtmf.com.br/", className = "br.com.gtmf.wsdl.LogoutResponse")
    @Action(input = "http://gtmf.com.br/SimInterfaceImpl/logoutRequest", output = "http://gtmf.com.br/SimInterfaceImpl/logoutResponse")
    public String logout(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "startRadar", targetNamespace = "http://gtmf.com.br/", className = "br.com.gtmf.wsdl.StartRadar")
    @ResponseWrapper(localName = "startRadarResponse", targetNamespace = "http://gtmf.com.br/", className = "br.com.gtmf.wsdl.StartRadarResponse")
    @Action(input = "http://gtmf.com.br/SimInterfaceImpl/startRadarRequest", output = "http://gtmf.com.br/SimInterfaceImpl/startRadarResponse")
    public String startRadar(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "toStringList", targetNamespace = "http://gtmf.com.br/", className = "br.com.gtmf.wsdl.ToStringList")
    @ResponseWrapper(localName = "toStringListResponse", targetNamespace = "http://gtmf.com.br/", className = "br.com.gtmf.wsdl.ToStringListResponse")
    @Action(input = "http://gtmf.com.br/SimInterfaceImpl/toStringListRequest", output = "http://gtmf.com.br/SimInterfaceImpl/toStringListResponse")
    public String toStringList(
        @WebParam(name = "arg0", targetNamespace = "")
        List<String> arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "stopRadar", targetNamespace = "http://gtmf.com.br/", className = "br.com.gtmf.wsdl.StopRadar")
    @ResponseWrapper(localName = "stopRadarResponse", targetNamespace = "http://gtmf.com.br/", className = "br.com.gtmf.wsdl.StopRadarResponse")
    @Action(input = "http://gtmf.com.br/SimInterfaceImpl/stopRadarRequest", output = "http://gtmf.com.br/SimInterfaceImpl/stopRadarResponse")
    public String stopRadar(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "writeTo", targetNamespace = "http://gtmf.com.br/", className = "br.com.gtmf.wsdl.WriteTo")
    @ResponseWrapper(localName = "writeToResponse", targetNamespace = "http://gtmf.com.br/", className = "br.com.gtmf.wsdl.WriteToResponse")
    @Action(input = "http://gtmf.com.br/SimInterfaceImpl/writeToRequest", output = "http://gtmf.com.br/SimInterfaceImpl/writeToResponse")
    public String writeTo(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "changeLocation", targetNamespace = "http://gtmf.com.br/", className = "br.com.gtmf.wsdl.ChangeLocation")
    @ResponseWrapper(localName = "changeLocationResponse", targetNamespace = "http://gtmf.com.br/", className = "br.com.gtmf.wsdl.ChangeLocationResponse")
    @Action(input = "http://gtmf.com.br/SimInterfaceImpl/changeLocationRequest", output = "http://gtmf.com.br/SimInterfaceImpl/changeLocationResponse")
    public String changeLocation(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listNearlyClients", targetNamespace = "http://gtmf.com.br/", className = "br.com.gtmf.wsdl.ListNearlyClients")
    @ResponseWrapper(localName = "listNearlyClientsResponse", targetNamespace = "http://gtmf.com.br/", className = "br.com.gtmf.wsdl.ListNearlyClientsResponse")
    @Action(input = "http://gtmf.com.br/SimInterfaceImpl/listNearlyClientsRequest", output = "http://gtmf.com.br/SimInterfaceImpl/listNearlyClientsResponse")
    public String listNearlyClients(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addRoom", targetNamespace = "http://gtmf.com.br/", className = "br.com.gtmf.wsdl.AddRoom")
    @ResponseWrapper(localName = "addRoomResponse", targetNamespace = "http://gtmf.com.br/", className = "br.com.gtmf.wsdl.AddRoomResponse")
    @Action(input = "http://gtmf.com.br/SimInterfaceImpl/addRoomRequest", output = "http://gtmf.com.br/SimInterfaceImpl/addRoomResponse")
    public String addRoom(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getRoom", targetNamespace = "http://gtmf.com.br/", className = "br.com.gtmf.wsdl.GetRoom")
    @ResponseWrapper(localName = "getRoomResponse", targetNamespace = "http://gtmf.com.br/", className = "br.com.gtmf.wsdl.GetRoomResponse")
    @Action(input = "http://gtmf.com.br/SimInterfaceImpl/getRoomRequest", output = "http://gtmf.com.br/SimInterfaceImpl/getRoomResponse")
    public String getRoom(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listRooms", targetNamespace = "http://gtmf.com.br/", className = "br.com.gtmf.wsdl.ListRooms")
    @ResponseWrapper(localName = "listRoomsResponse", targetNamespace = "http://gtmf.com.br/", className = "br.com.gtmf.wsdl.ListRoomsResponse")
    @Action(input = "http://gtmf.com.br/SimInterfaceImpl/listRoomsRequest", output = "http://gtmf.com.br/SimInterfaceImpl/listRoomsResponse")
    public String listRooms();

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "changeClientRoom", targetNamespace = "http://gtmf.com.br/", className = "br.com.gtmf.wsdl.ChangeClientRoom")
    @ResponseWrapper(localName = "changeClientRoomResponse", targetNamespace = "http://gtmf.com.br/", className = "br.com.gtmf.wsdl.ChangeClientRoomResponse")
    @Action(input = "http://gtmf.com.br/SimInterfaceImpl/changeClientRoomRequest", output = "http://gtmf.com.br/SimInterfaceImpl/changeClientRoomResponse")
    public String changeClientRoom(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "toString", targetNamespace = "http://gtmf.com.br/", className = "br.com.gtmf.wsdl.ToString")
    @ResponseWrapper(localName = "toStringResponse", targetNamespace = "http://gtmf.com.br/", className = "br.com.gtmf.wsdl.ToStringResponse")
    @Action(input = "http://gtmf.com.br/SimInterfaceImpl/toStringRequest", output = "http://gtmf.com.br/SimInterfaceImpl/toStringResponse")
    public String toString(
        @WebParam(name = "arg0", targetNamespace = "")
        List<Client> arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "write", targetNamespace = "http://gtmf.com.br/", className = "br.com.gtmf.wsdl.Write")
    @ResponseWrapper(localName = "writeResponse", targetNamespace = "http://gtmf.com.br/", className = "br.com.gtmf.wsdl.WriteResponse")
    @Action(input = "http://gtmf.com.br/SimInterfaceImpl/writeRequest", output = "http://gtmf.com.br/SimInterfaceImpl/writeResponse")
    public String write(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

}