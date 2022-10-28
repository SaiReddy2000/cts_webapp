package com.sai.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")
public class WelcomeController {
	
	@GetMapping
	@RequestMapping("/")
	public String getWelcome() {
		return "Welcome to Jenkins";
	}
	
	@GetMapping
	@RequestMapping("/{name}")
	public String getName(@PathVariable String name) {
		return "Welcome - " + name;
	}

}
