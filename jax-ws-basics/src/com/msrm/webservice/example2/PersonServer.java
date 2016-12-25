package com.msrm.webservice.example2;

import javax.xml.ws.Endpoint;

public class PersonServer {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8888/personWS", new PersonServiceImpl());
		System.out.println("PersonServer started.");
	}

}
