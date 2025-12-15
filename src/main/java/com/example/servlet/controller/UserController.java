package com.example.servlet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.servlet.models.SingletoneModel;

@RestController
@RequestMapping("v1/user")
public class UserController {

	// field injection
	@Autowired
	SingletoneModel model;

	
	
	


	@GetMapping("/")
	ResponseEntity<String> getBeanName() {
		model.show();
	
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@GetMapping("/test")
	ResponseEntity<String> getBeanNameTest() {
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
