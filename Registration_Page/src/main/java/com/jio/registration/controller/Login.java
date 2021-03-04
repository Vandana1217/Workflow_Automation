package com.jio.registration.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

import com.jio.registration.daofactory.DbConnection;
import com.jio.registration.model.MemberLogin;
import com.jio.registration.service.LoginService;


public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		final Logger logger= Logger.getLogger(Login.class);
		String email= request.getParameter("email");
		String password= request.getParameter("password");
		String result="";
		 
		logger.info("Email->>>" +email);
		logger.info("Password->>" +password);
		
		MemberLogin memberLogin= new MemberLogin(email, password);
		
		LoginService loginService=new LoginService();
		try {
			result=loginService.userLogin(memberLogin);
		} catch (ClassNotFoundException e) {
			
		} catch (IOException e) {
			
		} catch (SQLException e) {
			
		}
		session.setAttribute("Message", result);
		response.sendRedirect("display.jsp");
		
	}

}
