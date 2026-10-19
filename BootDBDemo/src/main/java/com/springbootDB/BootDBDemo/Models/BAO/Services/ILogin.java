package com.springbootDB.BootDBDemo.Models.BAO.Services;

import com.springbootDB.BootDBDemo.Models.Pojos.Login;

public interface ILogin {
	
	String Register(Login L);
	Boolean Validate(String username, String password);
	

}
