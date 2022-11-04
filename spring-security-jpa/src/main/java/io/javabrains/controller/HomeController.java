package io.javabrains.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HomeController {

	@GetMapping("/")
	public String homePage() {
		return ("<h1>Home Page</h1>");
	}

	@GetMapping("/user")
	public String userPage() {
		return ("<h1>User Page</h1>");
	}

	@GetMapping("/admin")
	public String adminPage() {
		return ("<h1>Admin Page</h1>");
	}
	
	@RequestMapping(value= "/403")
	public String accessDenied (Principal user) {
		
		if(user!=null) {
			return ("<h1>Hi </h1>" +user.getName()+ "<h1>, it seems you are not authorized to access this page :/</h1>");
		}
		else {
			return ("<h1>You are not authorized to access this page!</h1>");
		}
	}
}
