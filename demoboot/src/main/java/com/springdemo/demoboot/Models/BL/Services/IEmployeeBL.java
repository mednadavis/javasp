
package com.springdemo.demoboot.Models.BL.Services;

import java.util.List;
import com.springdemo.demoboot.Models.pojos.Employee;

public interface IEmployeeBL {

    public String AddEmployee(Employee E);

    public String RemoveEmployee(int empno);

    public List<Employee> DisplayEmployee();

}
