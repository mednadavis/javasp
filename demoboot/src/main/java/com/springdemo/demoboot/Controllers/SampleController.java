package com.springdemo.demoboot.Controllers;

import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springdemo.demoboot.Models.BL.ServiceImplementation.EmployeeBL;
import com.springdemo.demoboot.Models.BL.Services.IEmployeeBL;
import com.springdemo.demoboot.Models.pojos.Employee;

@Controller
public class SampleController {
	
	//@Autowired
	IEmployeeBL I;

//	public SampleController(IEmployeeBL i) {
//		super();
//		I = i;
//	}

	public IEmployeeBL getI() {
		return I;
	}

	@Autowired
	public void setI(IEmployeeBL i) {
		I = i;
	}

	@RequestMapping("/First")
	public String firstmethod() {
		return "First";
	}

	@RequestMapping("/Second")
	public String secondmethod() {
		return "Second";
	}

	@RequestMapping("/SendStr")
	public String SendString(Model M) {
		M.addAttribute("S", "Welcome all from str");
		return "Sendstring";
	}

	@RequestMapping("/SendStrs")
	public String SendStrings(Model M) {
		String names[] = { "Siva", "Hari" };
		M.addAttribute("Strs", names);
		return "Sendstrings";
	}

	@RequestMapping("/SendStr1")
	public ModelAndView SendString1() {
		ModelAndView M = new ModelAndView("Sendstring");
		M.addObject("S", "Welcome all from str");
		return M;
	}

	@RequestMapping("/SendStrs1")
	public ModelAndView SendStrings1() {
		ModelAndView M = new ModelAndView("Sendstrings");
		String names[] = { "Siva", "Hari" };
		M.addObject("Strs", names);
		return M;
	}

	@RequestMapping("/SendObject")
	public String SendObject(Model M) {
		Employee E = new Employee(1, "Ram", LocalDate.parse("1990-09-02"), "ASDFG123", 20000);
		M.addAttribute("emp", E);
		return "SendObject";

	}

	@RequestMapping("/SendObjects")
	public String SendObjects(Model M) {

		List<Employee> list = new ArrayList<Employee>();
		Employee E;

		E = new Employee(1, "Ram", LocalDate.parse("1990-09-02"), "ASDFG123", 20000);
		list.add(E);

		E = new Employee(2, "Sita", LocalDate.parse("1995-04-15"), "QWERTY456", 30000);
		list.add(E);

		E = new Employee(3, "Arun", LocalDate.parse("2000-12-25"), "ZXCVB789", 40000);
		list.add(E);

		M.addAttribute("emps", list);

		return "SendObjects";
	}

	@RequestMapping("/SendObjects1")
	public String SendObjects1(Model M) {
		//IEmployeeBL I = new EmployeeBl();  no need after making service and autowired annotation
		List<Employee> list = I.DisplayEmployee();

		M.addAttribute("emps", list);

		return "SendObjects";
	}

}
