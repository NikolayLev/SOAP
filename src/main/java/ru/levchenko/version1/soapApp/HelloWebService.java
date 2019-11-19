package ru.levchenko.version1.soapApp;


import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

//Указываем что наш интерфейс - это Веб сервис
@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)//Веб сервис будет использован для вызова методаRPC (Remote Procedure Calling – удаленный вызов процедур)
public interface HelloWebService {

    @WebMethod
    public String getHelloString(String name);

}
