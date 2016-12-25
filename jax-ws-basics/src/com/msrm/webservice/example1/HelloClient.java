package com.msrm.webservice.example1;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class HelloClient {

	public static void main(String[] args) throws MalformedURLException {
		URL wsdlURL = new URL("http://localhost:8888/helloWS?wsdl");
		// check above URL in browser, you should see WSDL file
		System.out.println("wsdl obtained");

		// creating QName using targetNamespace and name
		QName qname = new QName("http://example1.webservice.msrm.com/", "HelloServiceImplService");
		System.out.println("targetNamespace created");

		Service service = Service.create(wsdlURL, qname);
		System.out.println("service created: " + service);

		// We need to pass interface and model beans to client
		HelloService hs = service.getPort(HelloService.class);
		System.out.println("HelloService obtained from remote");

		if (hs != null) {
			System.out.println(hs.sayHello("Sriram"));
		}
		System.out.println("HelloClient ends");
	}

}
