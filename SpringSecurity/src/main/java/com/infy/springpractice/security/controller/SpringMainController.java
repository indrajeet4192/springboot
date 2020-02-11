package com.infy.springpractice.security.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringMainController {
	@RequestMapping("/")
	public String getMessage() {
		return "Hello Spring Security";
	}
}
