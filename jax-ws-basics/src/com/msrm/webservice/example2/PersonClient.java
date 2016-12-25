package com.msrm.webservice.example2;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

/**
 * To generate Stub code of webservice.
 * <code>wsimport -s . http://localhost:8888/personWS?wsdl</code>
 * @author srirammuthaiah
 *
 */
public class PersonClient {

	public static void main(String[] args) throws MalformedURLException {
		URL wsdlUrl = new URL("http://localhost:8888/personWS?wsdl");
		QName serviceName = new QName("http://example2.webservice.msrm.com/", "PersonServiceImplService");
		Service service = Service.create(wsdlUrl, serviceName);
		PersonService personService = service.getPort(PersonService.class);

		Person person1 = new Person(1, "Sriram", 3001.25f);
		Person person2 = new Person(2, "Praveen", 3211.22f);
		Person person3 = new Person(3, "Soma sundarraj", 3200.32f);
		personService.add(person1);
		personService.add(person2);
		personService.add(person3);

		personService.getAllPerson().forEach(System.out::println);
	}

}
