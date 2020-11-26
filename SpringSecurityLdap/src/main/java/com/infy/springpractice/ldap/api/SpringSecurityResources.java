package com.infy.springpractice.ldap.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringSecurityResources {
	@RequestMapping("/")
	public String index() {
		return "Welcome LDAP";
	}

}
