package com.example.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.security.model.User;
import com.example.security.repository.UserRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{
	
	@Autowired
	private UserRepository UserRepository;

	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException{
		User user = UserRepository.findByUserName(userName);

		if (user == null)
			throw new UsernameNotFoundException(userName);
		
		return new UserDetailsImpl(user);
	}

}
