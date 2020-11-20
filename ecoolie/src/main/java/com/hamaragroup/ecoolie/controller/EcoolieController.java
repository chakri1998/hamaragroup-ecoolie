package com.hamaragroup.ecoolie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hamaragroup.ecoolie.serviceinterface.EcoolieServiceInterface;

@RestController
public class EcoolieController {

	@Autowired
	EcoolieServiceInterface ecoolieServiceInterface;
	
	@GetMapping
	public String helloWorld() {
		String helloworld= ecoolieServiceInterface.helloWorld();
		
		return helloworld;
		
	}
}
