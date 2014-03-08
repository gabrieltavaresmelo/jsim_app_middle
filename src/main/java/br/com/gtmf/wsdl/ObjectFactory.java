
package br.com.gtmf.wsdl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.gtmf.wsdl package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ListRooms_QNAME = new QName("http://gtmf.com.br/", "listRooms");
    private final static QName _ToString_QNAME = new QName("http://gtmf.com.br/", "toString");
    private final static QName _WriteResponse_QNAME = new QName("http://gtmf.com.br/", "writeResponse");
    private final static QName _ChangeLocation_QNAME = new QName("http://gtmf.com.br/", "changeLocation");
    private final static QName _GetRoom_QNAME = new QName("http://gtmf.com.br/", "getRoom");
    private final static QName _ChangeClientRoom_QNAME = new QName("http://gtmf.com.br/", "changeClientRoom");
    private final static QName _Logout_QNAME = new QName("http://gtmf.com.br/", "logout");
    private final static QName _WriteTo_QNAME = new QName("http://gtmf.com.br/", "writeTo");
    private final static QName _StartRadarResponse_QNAME = new QName("http://gtmf.com.br/", "startRadarResponse");
    private final static QName _ListNearlyClientsResponse_QNAME = new QName("http://gtmf.com.br/", "listNearlyClientsResponse");
    private final static QName _WriteToResponse_QNAME = new QName("http://gtmf.com.br/", "writeToResponse");
    private final static QName _ListNearlyClients_QNAME = new QName("http://gtmf.com.br/", "listNearlyClients");
    private final static QName _ChangeLocationResponse_QNAME = new QName("http://gtmf.com.br/", "changeLocationResponse");
    private final static QName _StopRadar_QNAME = new QName("http://gtmf.com.br/", "stopRadar");
    private final static QName _StopRadarResponse_QNAME = new QName("http://gtmf.com.br/", "stopRadarResponse");
    private final static QName _AddRoomResponse_QNAME = new QName("http://gtmf.com.br/", "addRoomResponse");
    private final static QName _LoginResponse_QNAME = new QName("http://gtmf.com.br/", "loginResponse");
    private final static QName _StartRadar_QNAME = new QName("http://gtmf.com.br/", "startRadar");
    private final static QName _AddRoom_QNAME = new QName("http://gtmf.com.br/", "addRoom");
    private final static QName _Write_QNAME = new QName("http://gtmf.com.br/", "write");
    private final static QName _Login_QNAME = new QName("http://gtmf.com.br/", "login");
    private final static QName _ChangeClientRoomResponse_QNAME = new QName("http://gtmf.com.br/", "changeClientRoomResponse");
    private final static QName _ToStringResponse_QNAME = new QName("http://gtmf.com.br/", "toStringResponse");
    private final static QName _LogoutResponse_QNAME = new QName("http://gtmf.com.br/", "logoutResponse");
    private final static QName _ListRoomsResponse_QNAME = new QName("http://gtmf.com.br/", "listRoomsResponse");
    private final static QName _ToStringListResponse_QNAME = new QName("http://gtmf.com.br/", "toStringListResponse");
    private final static QName _ToStringList_QNAME = new QName("http://gtmf.com.br/", "toStringList");
    private final static QName _GetRoomResponse_QNAME = new QName("http://gtmf.com.br/", "getRoomResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.gtmf.wsdl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetRoomResponse }
     * 
     */
    public GetRoomResponse createGetRoomResponse() {
        return new GetRoomResponse();
    }

    /**
     * Create an instance of {@link ToStringList }
     * 
     */
    public ToStringList createToStringList() {
        return new ToStringList();
    }

    /**
     * Create an instance of {@link ToStringListResponse }
     * 
     */
    public ToStringListResponse createToStringListResponse() {
        return new ToStringListResponse();
    }

    /**
     * Create an instance of {@link Write }
     * 
     */
    public Write createWrite() {
        return new Write();
    }

    /**
     * Create an instance of {@link AddRoom }
     * 
     */
    public AddRoom createAddRoom() {
        return new AddRoom();
    }

    /**
     * Create an instance of {@link ChangeClientRoomResponse }
     * 
     */
    public ChangeClientRoomResponse createChangeClientRoomResponse() {
        return new ChangeClientRoomResponse();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link ToStringResponse }
     * 
     */
    public ToStringResponse createToStringResponse() {
        return new ToStringResponse();
    }

    /**
     * Create an instance of {@link ListRoomsResponse }
     * 
     */
    public ListRoomsResponse createListRoomsResponse() {
        return new ListRoomsResponse();
    }

    /**
     * Create an instance of {@link LogoutResponse }
     * 
     */
    public LogoutResponse createLogoutResponse() {
        return new LogoutResponse();
    }

    /**
     * Create an instance of {@link StopRadarResponse }
     * 
     */
    public StopRadarResponse createStopRadarResponse() {
        return new StopRadarResponse();
    }

    /**
     * Create an instance of {@link AddRoomResponse }
     * 
     */
    public AddRoomResponse createAddRoomResponse() {
        return new AddRoomResponse();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link StartRadar }
     * 
     */
    public StartRadar createStartRadar() {
        return new StartRadar();
    }

    /**
     * Create an instance of {@link WriteToResponse }
     * 
     */
    public WriteToResponse createWriteToResponse() {
        return new WriteToResponse();
    }

    /**
     * Create an instance of {@link ListNearlyClients }
     * 
     */
    public ListNearlyClients createListNearlyClients() {
        return new ListNearlyClients();
    }

    /**
     * Create an instance of {@link ChangeLocationResponse }
     * 
     */
    public ChangeLocationResponse createChangeLocationResponse() {
        return new ChangeLocationResponse();
    }

    /**
     * Create an instance of {@link StopRadar }
     * 
     */
    public StopRadar createStopRadar() {
        return new StopRadar();
    }

    /**
     * Create an instance of {@link GetRoom }
     * 
     */
    public GetRoom createGetRoom() {
        return new GetRoom();
    }

    /**
     * Create an instance of {@link ChangeClientRoom }
     * 
     */
    public ChangeClientRoom createChangeClientRoom() {
        return new ChangeClientRoom();
    }

    /**
     * Create an instance of {@link Logout }
     * 
     */
    public Logout createLogout() {
        return new Logout();
    }

    /**
     * Create an instance of {@link WriteTo }
     * 
     */
    public WriteTo createWriteTo() {
        return new WriteTo();
    }

    /**
     * Create an instance of {@link StartRadarResponse }
     * 
     */
    public StartRadarResponse createStartRadarResponse() {
        return new StartRadarResponse();
    }

    /**
     * Create an instance of {@link ListNearlyClientsResponse }
     * 
     */
    public ListNearlyClientsResponse createListNearlyClientsResponse() {
        return new ListNearlyClientsResponse();
    }

    /**
     * Create an instance of {@link ListRooms }
     * 
     */
    public ListRooms createListRooms() {
        return new ListRooms();
    }

    /**
     * Create an instance of {@link WriteResponse }
     * 
     */
    public WriteResponse createWriteResponse() {
        return new WriteResponse();
    }

    /**
     * Create an instance of {@link ToString }
     * 
     */
    public ToString createToString() {
        return new ToString();
    }

    /**
     * Create an instance of {@link ChangeLocation }
     * 
     */
    public ChangeLocation createChangeLocation() {
        return new ChangeLocation();
    }

    /**
     * Create an instance of {@link Client }
     * 
     */
    public Client createClient() {
        return new Client();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListRooms }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gtmf.com.br/", name = "listRooms")
    public JAXBElement<ListRooms> createListRooms(ListRooms value) {
        return new JAXBElement<ListRooms>(_ListRooms_QNAME, ListRooms.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ToString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gtmf.com.br/", name = "toString")
    public JAXBElement<ToString> createToString(ToString value) {
        return new JAXBElement<ToString>(_ToString_QNAME, ToString.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WriteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gtmf.com.br/", name = "writeResponse")
    public JAXBElement<WriteResponse> createWriteResponse(WriteResponse value) {
        return new JAXBElement<WriteResponse>(_WriteResponse_QNAME, WriteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeLocation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gtmf.com.br/", name = "changeLocation")
    public JAXBElement<ChangeLocation> createChangeLocation(ChangeLocation value) {
        return new JAXBElement<ChangeLocation>(_ChangeLocation_QNAME, ChangeLocation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRoom }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gtmf.com.br/", name = "getRoom")
    public JAXBElement<GetRoom> createGetRoom(GetRoom value) {
        return new JAXBElement<GetRoom>(_GetRoom_QNAME, GetRoom.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeClientRoom }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gtmf.com.br/", name = "changeClientRoom")
    public JAXBElement<ChangeClientRoom> createChangeClientRoom(ChangeClientRoom value) {
        return new JAXBElement<ChangeClientRoom>(_ChangeClientRoom_QNAME, ChangeClientRoom.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Logout }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gtmf.com.br/", name = "logout")
    public JAXBElement<Logout> createLogout(Logout value) {
        return new JAXBElement<Logout>(_Logout_QNAME, Logout.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WriteTo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gtmf.com.br/", name = "writeTo")
    public JAXBElement<WriteTo> createWriteTo(WriteTo value) {
        return new JAXBElement<WriteTo>(_WriteTo_QNAME, WriteTo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StartRadarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gtmf.com.br/", name = "startRadarResponse")
    public JAXBElement<StartRadarResponse> createStartRadarResponse(StartRadarResponse value) {
        return new JAXBElement<StartRadarResponse>(_StartRadarResponse_QNAME, StartRadarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListNearlyClientsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gtmf.com.br/", name = "listNearlyClientsResponse")
    public JAXBElement<ListNearlyClientsResponse> createListNearlyClientsResponse(ListNearlyClientsResponse value) {
        return new JAXBElement<ListNearlyClientsResponse>(_ListNearlyClientsResponse_QNAME, ListNearlyClientsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WriteToResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gtmf.com.br/", name = "writeToResponse")
    public JAXBElement<WriteToResponse> createWriteToResponse(WriteToResponse value) {
        return new JAXBElement<WriteToResponse>(_WriteToResponse_QNAME, WriteToResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListNearlyClients }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gtmf.com.br/", name = "listNearlyClients")
    public JAXBElement<ListNearlyClients> createListNearlyClients(ListNearlyClients value) {
        return new JAXBElement<ListNearlyClients>(_ListNearlyClients_QNAME, ListNearlyClients.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeLocationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gtmf.com.br/", name = "changeLocationResponse")
    public JAXBElement<ChangeLocationResponse> createChangeLocationResponse(ChangeLocationResponse value) {
        return new JAXBElement<ChangeLocationResponse>(_ChangeLocationResponse_QNAME, ChangeLocationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopRadar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gtmf.com.br/", name = "stopRadar")
    public JAXBElement<StopRadar> createStopRadar(StopRadar value) {
        return new JAXBElement<StopRadar>(_StopRadar_QNAME, StopRadar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopRadarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gtmf.com.br/", name = "stopRadarResponse")
    public JAXBElement<StopRadarResponse> createStopRadarResponse(StopRadarResponse value) {
        return new JAXBElement<StopRadarResponse>(_StopRadarResponse_QNAME, StopRadarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddRoomResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gtmf.com.br/", name = "addRoomResponse")
    public JAXBElement<AddRoomResponse> createAddRoomResponse(AddRoomResponse value) {
        return new JAXBElement<AddRoomResponse>(_AddRoomResponse_QNAME, AddRoomResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gtmf.com.br/", name = "loginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StartRadar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gtmf.com.br/", name = "startRadar")
    public JAXBElement<StartRadar> createStartRadar(StartRadar value) {
        return new JAXBElement<StartRadar>(_StartRadar_QNAME, StartRadar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddRoom }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gtmf.com.br/", name = "addRoom")
    public JAXBElement<AddRoom> createAddRoom(AddRoom value) {
        return new JAXBElement<AddRoom>(_AddRoom_QNAME, AddRoom.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Write }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gtmf.com.br/", name = "write")
    public JAXBElement<Write> createWrite(Write value) {
        return new JAXBElement<Write>(_Write_QNAME, Write.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gtmf.com.br/", name = "login")
    public JAXBElement<Login> createLogin(Login value) {
        return new JAXBElement<Login>(_Login_QNAME, Login.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeClientRoomResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gtmf.com.br/", name = "changeClientRoomResponse")
    public JAXBElement<ChangeClientRoomResponse> createChangeClientRoomResponse(ChangeClientRoomResponse value) {
        return new JAXBElement<ChangeClientRoomResponse>(_ChangeClientRoomResponse_QNAME, ChangeClientRoomResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ToStringResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gtmf.com.br/", name = "toStringResponse")
    public JAXBElement<ToStringResponse> createToStringResponse(ToStringResponse value) {
        return new JAXBElement<ToStringResponse>(_ToStringResponse_QNAME, ToStringResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogoutResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gtmf.com.br/", name = "logoutResponse")
    public JAXBElement<LogoutResponse> createLogoutResponse(LogoutResponse value) {
        return new JAXBElement<LogoutResponse>(_LogoutResponse_QNAME, LogoutResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListRoomsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gtmf.com.br/", name = "listRoomsResponse")
    public JAXBElement<ListRoomsResponse> createListRoomsResponse(ListRoomsResponse value) {
        return new JAXBElement<ListRoomsResponse>(_ListRoomsResponse_QNAME, ListRoomsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ToStringListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gtmf.com.br/", name = "toStringListResponse")
    public JAXBElement<ToStringListResponse> createToStringListResponse(ToStringListResponse value) {
        return new JAXBElement<ToStringListResponse>(_ToStringListResponse_QNAME, ToStringListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ToStringList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gtmf.com.br/", name = "toStringList")
    public JAXBElement<ToStringList> createToStringList(ToStringList value) {
        return new JAXBElement<ToStringList>(_ToStringList_QNAME, ToStringList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRoomResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gtmf.com.br/", name = "getRoomResponse")
    public JAXBElement<GetRoomResponse> createGetRoomResponse(GetRoomResponse value) {
        return new JAXBElement<GetRoomResponse>(_GetRoomResponse_QNAME, GetRoomResponse.class, null, value);
    }

}
