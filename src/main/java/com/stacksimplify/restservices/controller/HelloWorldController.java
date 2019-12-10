package com.stacksimplify.restservices.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping("/hellowrold1")
	//@RequestMapping(method=RequestMethod.GET,path="/helloworld")
	public String helloWorld() {
		return "Hello World1";
	}
	
	@RequestMapping(method=RequestMethod.GET, path="/helloworld-bean")
//	@GetMapping("/helloworld-bean")
	public UserDetails helloWorldBean() {
		return new UserDetails("Devaraj", "Chennur", "Bengaluru");
	}
}
