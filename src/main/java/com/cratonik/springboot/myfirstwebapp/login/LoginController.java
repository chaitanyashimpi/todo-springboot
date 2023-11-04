package com.cratonik.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	private AuthenticationService authentication;

	public LoginController(AuthenticationService authentication) {
		super();
		this.authentication = authentication;
	}

	@GetMapping("login")
	public String Login() {
		return "login";
	}

	@PostMapping("login")
	public String gotToWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap model) {

		if (authentication.authenticate(name, password)) {
			model.put("name", name);
			return "welcome";
		}
		model.put("errorMessage", "Invalid Credentials! Please try again!");
		return "login";
		// authentication
		// name-cratonik
		// password - dummy

	}
}
