package com.jio.registration.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;

import com.jio.registration.daofactory.DbConnection;
import com.jio.registration.model.RegisterMember;
import com.jio.registration.service.EncrpytPassword;




public class RegisterDaoImpl implements RegisterDao {
	
	DbConnection dbConnectionn=new DbConnection();
	
	 
	public int insert(RegisterMember registerMember) throws IOException, SQLException, ClassNotFoundException {
		int result = 0;
		String INSERT_USERS_SQL = "insert into user_registration(uname, email, password, phone, register_time) values(?,?,?,?,?)";
		
		
		Connection connection= dbConnectionn.createConnection();
		
		/* converting plain password into hashed password */
		String plain_password= registerMember.getPassword();
		String hash_password= EncrpytPassword.hashPassword(plain_password);
		
		/* Getting timestamp */
		Timestamp date = new Timestamp(new java.util.Date().getTime());
		
        PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL);{
			
			preparedStatement.setString(1, registerMember.getUname());
			preparedStatement.setString(2, registerMember.getEmail());
			preparedStatement.setString(3, hash_password);
			preparedStatement.setString(4, registerMember.getPhone());
			preparedStatement.setTimestamp(5, date);

			System.out.println(preparedStatement);

			result = preparedStatement.executeUpdate();

		} 
		
		return result;
		
		

	}}
