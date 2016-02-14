package com.moorah.services;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;


@WebService(endpointInterface = "com.moorah.services.Hello")
public class HelloImpl implements Hello {

    public String sayHello(String name) {
        if (name == null) {
            return "Hello";
        }
        return "Hello, " + name + "!";
    }
}
