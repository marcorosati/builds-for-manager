package com.javacodegeeks.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class HelloWorldController {

	@GetMapping("/hello/{id}")
	public String sayHello(@PathVariable String id) {
		return "Hello Java Code Geeks! id";
	}
}
