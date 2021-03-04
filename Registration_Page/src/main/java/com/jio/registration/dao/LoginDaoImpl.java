package com.jio.registration.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.log4j.Logger;

import com.jio.registration.daofactory.DbConnection;
import com.jio.registration.model.MemberLogin;
import com.jio.registration.service.EncrpytPassword;

public class LoginDaoImpl implements LoginDao {

	DbConnection dbConnection= new DbConnection();
	public int select(MemberLogin memberLogin) throws ClassNotFoundException, IOException, SQLException {
		
		final Logger logger= Logger.getLogger(LoginDaoImpl.class);
		
		//Getting data entered by user
		String email=memberLogin.getEmail();
		String password=memberLogin.getPassword();
		
		//DB email and password
		String emailDb="";
		String passwordDb="";
		
	    //SQL Query
		String selectQuery="Select email, password from user_registration";
		
		Connection connection =dbConnection.createConnection();
		Statement statment=connection.createStatement();
		ResultSet resultSet= statment.executeQuery(selectQuery);
		
		while(resultSet.next()) {
			
			emailDb=resultSet.getString("email");
			passwordDb=resultSet.getString("password");
			
			if(email.equals(emailDb))
            {
				logger.debug(resultSet);
				logger.info("Matching password");
				boolean res=EncrpytPassword.checkPassword(password, passwordDb);
				if(res)
				return 1;   //email and password both matched
				else 
				return -1;   //email exists but wrong password entered
            }
			
		}
		return 0;    //user not found
		
	
	}
	

}
