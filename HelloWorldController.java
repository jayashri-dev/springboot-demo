package com.rest.webservices.restful_web_services.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
// to create rest api
public class HelloWorldController {

//	@RequestMapping(method = RequestMethod.GET,path = "/helloworld")
	@GetMapping(path="/Hello-world")
	public String helloWorld() {
		return "HELLO WORLD THIS IS REST API ";
	}
	
	@GetMapping(path="/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean( "HELLO WORLD");
	}
	

	@GetMapping(path="/hello-world/path-variable/{name}")
	public HelloWorldBean helloWorldBeanPathVariable(@PathVariable String name) {
		return new HelloWorldBean(String.format("HELLO WORLD , %s", name));
	}
	
}
