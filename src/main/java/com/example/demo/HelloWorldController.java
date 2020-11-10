package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	//@RequestMapping(method = RequestMethod.GET, path = "/helloWorld")
	@GetMapping(path = "/helloWorld")
	public String helloWorld() {
		return "Hello World";
	}
	
	@GetMapping(path = "/helloWorldBean")
	public HellWorldBean helloWorldBean() {
		return new HellWorldBean("Hello World");
	}
	
	@GetMapping(path = "/helloWorld/path-variable/{name}")
	public HellWorldBean helloWorldPathVariable(@PathVariable String name) {
		return new HellWorldBean(String.format("Hello World, %s", name));
	}

}
