package com.springdemo.demoboot.Models.pojos;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Employee {
	
	private Integer empno;
	private String ename;
	private LocalDate dob;
	private String pancard;
	private double basic;
	
	

}
