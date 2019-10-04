package com.example.demoApp.service;

import org.springframework.stereotype.Service;

@Service
public class PersonService {

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	private String id;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String name;
}
