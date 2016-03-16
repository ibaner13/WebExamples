package com.training.controllers;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.Person;

@RestController
@RequestMapping("/Person")
public class PersonRestController {

	Map<Integer,Person> personMap = new HashMap<>();
	
	@PostConstruct
	public void init()
	{
		personMap.put(1, new Person("Ishika", "Banerjee", "ishika@gmail.com"));
		personMap.put(2, new Person("Dhawal", "Singhal", "dhawal@gmail.com"));
		personMap.put(3, new Person("Gaurav", "Pant", "gaurav@gmail.com;"));
		personMap.put(4, new Person("Ravi", "Ray", "ravi@gmail.com"));
	}
	
	@RequestMapping("/all")
	public Collection<Person> getAll()
	{
		return personMap.values();
	}
	
}
