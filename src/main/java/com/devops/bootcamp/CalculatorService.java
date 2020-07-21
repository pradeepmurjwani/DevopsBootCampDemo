package com.devops.bootcamp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorService {

	@GetMapping("/hello")
	public String sayHello() {
		return "Hello";
	}
}
