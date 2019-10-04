package com.example.demoApp.controller;



import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RestController;

import com.example.demoApp.service.PersonService;

@RestController
public class PersonController {

	@Autowired
	PersonService personService;
	
	
	ArrayList<PersonService> ps=new ArrayList<PersonService>();
	
	@GetMapping(value="/showAllData", produces="application/JSON")
	public ArrayList<PersonService> showAllPerson() {
		
		
		personService.setId("12");
		personService.setName("sasi");
		ps.add(personService);
		return ps;
	}
	
	@GetMapping(value="/showById/{id}",produces="application/JSON")
	public ArrayList<PersonService> showByIdPerson(@PathVariable(name="id") String id) {
		
		ArrayList<PersonService> ps1=new ArrayList<PersonService>();
		for( PersonService obj:ps) {
			
			if(obj.getId().equals(id)) {
				ps1.add(obj);
			}
		}
		return ps1;
	}
	
	@PostMapping(value="/getData/{id}/{name}",produces="application/JSON")
    public ArrayList<PersonService> getPersonData(@PathVariable(name="id") String id,@PathVariable(name="name") String name) {
		
		
		personService.setId(id);
		personService.setName(name);
		ps.add(personService);
		return ps;
	}
	
	
}
