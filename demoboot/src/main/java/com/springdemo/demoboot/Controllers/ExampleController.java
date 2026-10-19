package com.springdemo.demoboot.Controllers;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springdemo.demoboot.Models.BL.Services.IEmployeeBL;
import com.springdemo.demoboot.Models.pojos.Employee;

@Controller
public class ExampleController {
	
	@Autowired
	IEmployeeBL I;
	
	@RequestMapping("/Getemp")
	public String getDetails() {
		
		return "Getemp";
	}
	
	@RequestMapping("/Getempbound")
	public String getDetailsBound() {
		
		return "Getempbound";
	}
	
//	//one method
//		@RequestMapping("/Fetchemp")
//		public String fetchEmp(@RequestParam("eno")int e1,
//				@RequestParam("en")String e2,
//				@RequestParam("db")LocalDate e3,
//				@RequestParam("pan")String e4,
//				@RequestParam("basic")double e5, Model M) {
//			
//			Employee E = new Employee(e1,e2,e3,e4,e5);
//			I.AddEmployee(E);
//			System.out.println(e1);
//			List<Employee> list = I.DisplayEmployee();		
//			M.addAttribute("emps", list);
//			return "SendObjects";
//		}
	
	@RequestMapping("/Fetchemp")
	public String fetchEmp(@RequestParam("eno") int e1,
			@RequestParam("en")String e2,
			@RequestParam("db")LocalDate e3,
			@RequestParam("pan")String e4,
			@RequestParam("basic")double e5) {
		
		Employee E = new Employee(e1,e2,e3,e4,e5);
		I.AddEmployee(E);
		System.out.println(e1);
;		
		return "redirect:/SendObjects1";
	}
	
	@RequestMapping("/Fetchempbound")
	public String fetchEmpbound(@ModelAttribute Employee E) {
		I.AddEmployee(E);
		
;		
		return "redirect:/SendObjects1";
	}
	

}
