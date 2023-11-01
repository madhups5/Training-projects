package com.npci.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.npci.beans.Profile;
import com.npci.exceptions.ProfileNotFoundException;
import com.npci.service.profileServiceImpl;

@RestController
@RequestMapping("/profiles")
public class ProfileController {

	@Autowired
	private profileServiceImpl profileservice;

	@PostMapping(path = "/save", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> store(@RequestBody Profile profile) {
		Profile p = profileservice.createProfile(profile);
		return ResponseEntity.status(404).body(p);
	}
	
	@GetMapping(path="/login/{emailId}/{password}",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> login(@PathVariable("emailId") String emailId,@PathVariable("password") String password)
	{
		try {
			return ResponseEntity.status(200).body(profileservice.Login(emailId, password));
		} catch (ProfileNotFoundException e) {
			Map<String,String> map=new HashMap<>();
			map.put("error", e.getMessage());
			return ResponseEntity.status(404).body(map);
			
		}
	}
}
