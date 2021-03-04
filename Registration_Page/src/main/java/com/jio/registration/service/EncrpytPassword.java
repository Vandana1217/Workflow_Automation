package com.jio.registration.service;

import org.mindrot.jbcrypt.BCrypt;

public class EncrpytPassword {
	
	//To store hash password
	public static String hashPassword(String plainTextPassword){
		return BCrypt.hashpw(plainTextPassword, BCrypt.gensalt());
	}
	
	//To check hashed dbpassword with plain password
	public static boolean checkPassword(String plainPassword, String hashedPassword) {
		if (BCrypt.checkpw(plainPassword, hashedPassword))
			return true;
		else
			return false;
	}

}
     