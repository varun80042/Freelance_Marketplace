package com.vlanz.vlanz.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.vlanz.vlanz.model.User;
import com.vlanz.vlanz.controller.UserRegistrationDto;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
