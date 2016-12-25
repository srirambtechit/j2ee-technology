package com.msrm.webservice.example2;

import java.util.List;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style=Style.DOCUMENT)
public interface PersonService {
	
	void add(Person person);
	
	void update(Person person);
	
	void delete(Person person);
	
	List<Person> getAllPerson();

}
