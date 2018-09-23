package com.netsgroup.service.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {

	@Value("${spring.application.name}")
	public String profile;
	
	@GetMapping(value = "/info")
	public ResponseEntity<Map<String,String>> root() {
		Map<String, String> response = new HashMap<String, String>();
		response.put("profile", profile);
		return new ResponseEntity<Map<String,String>>(response, HttpStatus.OK);
	}
}
