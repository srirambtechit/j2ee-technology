package com.msrm.webservice.example1;

import javax.jws.WebService;

@WebService(endpointInterface="com.msrm.webservice.example1.HelloService")
public class HelloServiceImpl {

	public String sayHello(String name) {
		return "Hello Mr. " + name;
	}

}
