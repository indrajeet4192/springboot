package com.infy.springpractice.security.userdetails;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositoryJPA extends JpaRepository<UserJPA, Integer> {
	Optional<UserJPA> findByUsername(String username);
}
