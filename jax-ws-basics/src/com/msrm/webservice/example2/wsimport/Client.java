package com.msrm.webservice.example2.wsimport;

import java.util.List;

/**
 * This client will not work unless until changing the package from
 * com.msrm.webserice.example2.wsimport to com.msrm.webservice.example2
 * 
 * @author srirammuthaiah
 *
 */
public class Client {

	public static void main(String[] args) {
		PersonServiceImplService service = new PersonServiceImplService();
		PersonService personService = service.getPersonServiceImplPort();

		List<Person> allPerson = personService.getAllPerson();
		System.out.println("personList: " + allPerson);
	}

}
