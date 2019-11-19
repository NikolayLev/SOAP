package ru.levchenko.version1.soapApp.endpoint;


import ru.levchenko.version1.soapApp.HelloWebServiceImpl;

import javax.xml.ws.Endpoint;

public class HelloWebServicePublisher {
    public static void main(String[] args) {
        //запускаеи сервис на 1986 порту
        Endpoint.publish("http://localhost:1986/wss/hello", new HelloWebServiceImpl());
    }
}
