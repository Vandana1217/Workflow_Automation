package com.jio.registration.service;

import java.io.IOException;
import java.sql.SQLException;

import com.jio.registration.dao.LoginDaoImpl;
import com.jio.registration.model.MemberLogin;

public class LoginService {
	
	public String userLogin(MemberLogin memberLogin) throws ClassNotFoundException, IOException, SQLException {
		
		LoginDaoImpl loginDaoImpl= new LoginDaoImpl();
		int result=loginDaoImpl.select(memberLogin);
		
		if(result==1)
			return "LOGIN SUCCESSFUL";
		else if(result==-1)
				return "INCORRECT PASSWORD ENTERED";
		
			return "USER NOT FOUND. PLEASE SIGN UP";
	}

}        
