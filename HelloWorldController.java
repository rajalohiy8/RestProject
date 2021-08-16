package com.example.microservice.helloworld;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController		
public class HelloWorldController {

	
	@RequestMapping(method=RequestMethod.GET,path ="/hello")
	public String helloWorld() {
		return "Hello World";
	}
	
	@RequestMapping(method=RequestMethod.GET,path ="/helloBean")
	public HelloBean helloWorldBean() {
		return new HelloBean("Hello World Bean");
	}
	
	@RequestMapping(method=RequestMethod.GET,path ="/helloBean/path-variable/{name}")
	public HelloBean helloWorldPathVariable(@PathVariable String name) {
		return new HelloBean(String.format("Hello World %s",name));
	}
}
