package com.learn.spring.boot.todo.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.learn.spring.boot.todo.auth.AuthenticationService;

@Controller
@SessionAttributes("email")
public class LoginController {

	private AuthenticationService authService;

	public LoginController(AuthenticationService authService) {
		this.authService = authService;
	}


	@RequestMapping(value="login", method=RequestMethod.GET)
	public String loginPage() {
		return "/WEB-INF/jsp/login.jsp";
	}

	@RequestMapping(value="login", method=RequestMethod.POST)
	public String getPostedData(@RequestParam String Email, @RequestParam String Password, ModelMap model) {

		if(authService.authenticate(Email, Password)) {
			model.put("email", Email);
			model.put("password", Password);
			return "/WEB-INF/jsp/welcome.jsp";
		}
		else {
			model.put("error", "Bad credentials entered. Recheck the credentials!");
			return "/WEB-INF/jsp/login.jsp";
		}

	}	
}
