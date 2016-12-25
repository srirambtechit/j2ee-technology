package com.msrm.webservice.example2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.jws.WebService;

@WebService(endpointInterface = "com.msrm.webservice.example2.PersonService")
public class PersonServiceImpl implements PersonService {

	private Map<Integer, Person> persons = new HashMap<>();

	@Override
	public void add(Person person) {
		persons.put(person.getId(), person);
	}

	@Override
	public void update(Person person) {
		add(person);
	}

	@Override
	public void delete(Person person) {
		Person p = persons.get(person.getId());
		if (p != null) {
			persons.remove(p);
		}
	}

	@Override
	public List<Person> getAllPerson() {
		return persons.values().stream().collect(Collectors.toList());
	}

}
