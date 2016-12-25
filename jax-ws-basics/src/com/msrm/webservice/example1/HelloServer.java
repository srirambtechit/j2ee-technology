package com.msrm.webservice.example1;

import javax.xml.ws.Endpoint;

public class HelloServer {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8888/helloWS", new HelloServiceImpl());
		System.out.println("HelloServer running...");
	}

}
