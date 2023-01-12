package com.rest.controller;

import javax.ws.rs.core.MediaType;

import org.springframework.web.bind.annotation.GetMapping;

public class UserController {
	
	@GetMapping(value = "/user",
			produces = {MediaType.APPLICATION_JSON_UTF8_VALUE,	
    				MediaType.APPLICATION_XML_VALUE})
	public UserVO test() {
		
	}

}
