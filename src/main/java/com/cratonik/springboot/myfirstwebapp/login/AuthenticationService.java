package com.cratonik.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	
	
	public boolean authenticate(String username, String password) {
		
		boolean isValidName = username.equalsIgnoreCase("Cratonik");
		boolean isValidPass = password.equals("dummy");
		
		
		return isValidName && isValidPass;
		
	}
	
}
