package com.mwkim.awscicd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    
	@GetMapping("/hello")
	public String helloWorld(){
		return "helloWorld test";
	}
}
