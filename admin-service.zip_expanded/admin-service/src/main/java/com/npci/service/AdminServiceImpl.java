package com.npci.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AdminServiceImpl {

	@Autowired
	private RestTemplate rest;
     
	public String findingEmployee(int id) {
		String response=rest.getForObject("http://EMPLOYEE-APP/api/employees/"+id, String.class);
		//here we will get response content, which can be changed to java types
		// as rest.getForOject(Url,Employee.class)- converts json to employee Object
		return response;
		
	}

}
