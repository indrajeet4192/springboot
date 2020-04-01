package com.infy.springpractice.security.userdetails;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsServiceJPA implements UserDetailsService {
	@Autowired
	UserRepositoryJPA userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<UserJPA> user = userRepository.findByUsername(username);
		user.orElseThrow(()-> new UsernameNotFoundException("User name is not found: "+ username));
		return user.map(MyUserDetailsJPA::new).get();
	}

}
