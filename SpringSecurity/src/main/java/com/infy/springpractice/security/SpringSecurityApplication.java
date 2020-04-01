package com.infy.springpractice.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.infy.springpractice.security.userdetails.UserRepositoryJPA;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepositoryJPA.class)
public class SpringSecurityApplication {

	public static void main(String[] args) { 
		SpringApplication.run(SpringSecurityApplication.class, args);
	}

}
