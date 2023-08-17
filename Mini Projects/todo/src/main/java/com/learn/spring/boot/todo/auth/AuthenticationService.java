package com.learn.spring.boot.todo.auth;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	
	public boolean authenticate(String email, String password) {
		boolean isValidEmail = email.contentEquals("asdf@gmail.com");
		boolean isValidPassword = password.contentEquals("zxcv");		
		return isValidEmail && isValidPassword;
	}

}
