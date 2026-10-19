package com.springdemo.demoboot.Controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;

@Controller
@SessionAttributes({"ename","S"}) // we are adding two attributes so we are using array
public class ScopeController {
	
	@RequestMapping("/MPage1")
	public String Page1() {
		return "Page1";
	}

	@RequestMapping("/MPage2")
	public String Page2(@RequestParam("ename") String ename, Model M, HttpServletResponse resp) {

		Cookie C = new Cookie("cename", ename);
		//C.setMaxAge(5);
		String S []= {"naman", "iyer","pant"};
		resp.addCookie(C);
		
		M.addAttribute("ename", ename);
		return "Page2";
	}

	@RequestMapping("/MPage3")
	public String Page3(Model M) {
		System.out.println(M.getAttribute("ename"));
		return "Page3";
	}

}
