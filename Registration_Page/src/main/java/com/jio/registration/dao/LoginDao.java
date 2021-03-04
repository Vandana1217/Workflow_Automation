package com.jio.registration.dao;

import java.io.IOException;
import java.sql.SQLException;

import com.jio.registration.model.MemberLogin;

public interface LoginDao {

	public int select(MemberLogin memberLogin) throws ClassNotFoundException, IOException, SQLException;
}
