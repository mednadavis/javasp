package com.springbootDB.BootDBDemo.Models.Pojos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity   //-- it automatically creates table in DB with the name login 
@Table(name="SivaDLogin") // it gives table name as the name given  if we not use it the class name is the table name

public class Login {
	
	@Id                   // primary key
	@Column(length = 20)
	private String username;    // by default it takes 255 chars so use @Column
	
	@Column(length = 70)
	private String password; 
	
	@Transient                   // no column is created in database table
	private String confirmpassword;
	
	@Column(length = 20)
	private String usertype;
	

}
