package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	@GetMapping("/")
	public String getMessage()
	{
		return "Hi Open shift";
	}
	
	@PostMapping("/{name}")
	public String getMessage(@PathVariable String name)
	{
		return "Your Name is"+name;
	}
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
