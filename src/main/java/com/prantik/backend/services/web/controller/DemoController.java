package com.prantik.backend.services.web.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	
	@GetMapping("/get")
	public  ResponseEntity<String> getData(){
		ResponseEntity<String> entity = new ResponseEntity<String>("HELLOWORLD", HttpStatus.OK);
		return entity;
	}

}
