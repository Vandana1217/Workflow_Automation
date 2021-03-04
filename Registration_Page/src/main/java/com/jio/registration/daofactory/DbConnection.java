package com.jio.registration.daofactory;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.log4j.Logger;

public class DbConnection {

	public Connection createConnection() throws IOException, SQLException, ClassNotFoundException {
		
		final Logger logger= Logger.getLogger(DbConnection.class);

		// Reading file
		InputStream input = getClass().getClassLoader().getResourceAsStream("config.properties");
		Properties prop = new Properties();
		prop.load(input);
		
		// Reading properties
		String dataBaseUrl = prop.getProperty("dataBaseUrl");
		String dataBaseUserName = prop.getProperty("dataBaseUserName");
		String dataBasePassword = prop.getProperty("dataBasePassword");
		
		logger.info("Database URL->" + dataBaseUrl);
		logger.info("Database UserName->" + dataBaseUserName);
		logger.info("Database Password->" + dataBasePassword);
		
//		System.out.println(dataBaseUrl);
//		System.out.println(dataBaseUserName);
//		System.out.println(dataBasePassword);
		
		
		//Creating connection
		Class.forName("com.mysql.cj.jdbc.Driver");
//		System.out.println("Driver Loaded ");
		Connection connection = DriverManager.getConnection(dataBaseUrl, dataBaseUserName, dataBasePassword);
//		System.out.println("connection" +connection);
		return connection;

	}
}
