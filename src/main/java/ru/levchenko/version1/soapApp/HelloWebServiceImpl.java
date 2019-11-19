package ru.levchenko.version1.soapApp;

import javax.jws.WebService;

//У реализации указываем @WebService(Передаем путь до нашего интерфейсв)!!!
@WebService(endpointInterface = "ru.levchenko.version1.soapApp.HelloWebService")
public class HelloWebServiceImpl implements HelloWebService {
    @Override
    public String getHelloString(String name) {
        return "Hello "+name;
    }
}
