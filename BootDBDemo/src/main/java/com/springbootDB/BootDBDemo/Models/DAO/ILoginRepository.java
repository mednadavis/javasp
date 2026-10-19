package com.springbootDB.BootDBDemo.Models.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springbootDB.BootDBDemo.Models.Pojos.Login;

@Repository  // act as autowired  ( class is assigned by frame work (dependency injection))

public interface ILoginRepository extends JpaRepository<Login, String>{

}
