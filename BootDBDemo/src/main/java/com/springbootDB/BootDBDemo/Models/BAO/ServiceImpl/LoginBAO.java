package com.springbootDB.BootDBDemo.Models.BAO.ServiceImpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.springbootDB.BootDBDemo.Models.BAO.Services.ILogin;
import com.springbootDB.BootDBDemo.Models.DAO.ILoginRepository;
import com.springbootDB.BootDBDemo.Models.Pojos.Login;

@Service
public class LoginBAO implements ILogin {
	
	@Autowired
	PasswordEncoder passwordEncoder;
	
	@Autowired
	ILoginRepository loginRepository;
    

	@Override
	public String Register(Login L) {
		
		
		L.setPassword(passwordEncoder.encode(L.getPassword()));
		loginRepository.save(L); // as a part for autogeneration it gives the method
		
		return "Login registered Successfully";
	}

	@Override
	public Boolean Validate(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}

}
