package com.moorah.clients;

import com.moorah.services.Hello;
import com.moorah.services.HelloImpl;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebServiceRef;
import java.net.URL;

/**
 * ws-newsletter
 * Created by tcm on 2/14/16.
 */
public class HelloLocalClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            URL url = new URL("http://localhost:8080/newsletter/hello?wsdl");
            //1st argument service URI, refer to wsdl document above
            //2nd argument is service name, refer to wsdl document above
            QName qname = new QName("http://services.moorah.com/", "HelloImplService");
            Service service = Service.create(url, qname);
            Hello hello = service.getPort(Hello.class);
            System.out.println("Local: "+hello.sayHello("Thomas"));
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
