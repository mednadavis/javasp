package com.springbootDB.BootDBDemo.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springbootDB.BootDBDemo.Models.BAO.Services.ILogin;
import com.springbootDB.BootDBDemo.Models.Pojos.Login;

@Controller
public class LoginController {
	
	@Autowired
	ILogin login;
	
	@RequestMapping("/register")
	public  String Register() {
		return "jRegister";
	}
	
	@RequestMapping("/validate")
	public  String Validate( @ModelAttribute Login L, Model M) {
		String msg=login.Register(L);
		M.addAttribute("message", msg);
		return "jRegister";
	}

}
