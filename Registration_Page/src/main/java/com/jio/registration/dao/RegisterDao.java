package com.jio.registration.dao;

import java.io.IOException;
import java.sql.SQLException;

import com.jio.registration.model.RegisterMember;

public interface RegisterDao {
	
	public int insert(RegisterMember registerMember) throws IOException, SQLException, ClassNotFoundException;

}
