package com.jio.registration.service;

import java.io.IOException;
import java.sql.SQLException;

import com.jio.registration.dao.RegisterDaoImpl;
import com.jio.registration.model.RegisterMember;

public class RegisterService {
	
	int result=0;

	public RegisterMember registerMember;
	

	public String newRegistration(RegisterMember registerMember ) throws IOException, SQLException, ClassNotFoundException {
		RegisterDaoImpl registerDaoImpl= new RegisterDaoImpl() ;
		int result= registerDaoImpl.insert(registerMember);
		
		if(result!=0)
			return "SUCCESS";
		else
			return "FAILED";
		
}}
