package com.springdemo.demoboot.Models.BL.ServiceImplementation;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springdemo.demoboot.Models.BL.Services.IEmployeeBL;
import com.springdemo.demoboot.Models.pojos.Employee;


@Service
public class EmployeeBL implements IEmployeeBL {
	private static List<Employee> list = new ArrayList<Employee>();

	public EmployeeBL() {
		Employee E;

		E = new Employee(1, "Ram", LocalDate.parse("1990-09-01"), "ASDFG123", 20000);
		list.add(E);

		E = new Employee(2, "Sita", LocalDate.parse("1995-04-14"), "QWERTY456", 30000);
		list.add(E);

		E = new Employee(3, "Arun", LocalDate.parse("2000-12-26"), "ZXCVB789", 40000);
		list.add(E);

	}

	@Override
	public String AddEmployee(Employee E) {
// TODO Auto-generated method stub
		list.add(E);
		return "Employee Added Successfully";
	}

	@Override
	public String RemoveEmployee(int empno) {
// TODO Auto-generated method stub
		boolean flag = false;
		for (Employee e : list) {
			if (e.getEmpno() == empno) {
				list.remove(e);
				flag = true;
			}
		}
		if (flag) {
			return "Employee removed";
		} else {
			return "Employee doenot exist";
		}
	}

	@Override
	public List<Employee> DisplayEmployee() {
		return list;
	}

}
