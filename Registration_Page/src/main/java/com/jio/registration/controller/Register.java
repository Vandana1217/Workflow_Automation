package com.jio.registration.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jio.registration.model.RegisterMember;
import com.jio.registration.service.RegisterService;


public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String result=null;
		HttpSession session = request.getSession(false);
		
		String uname = request.getParameter("uname");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		String phone=request.getParameter("phone");
		
		RegisterMember registerMember= new RegisterMember();
		registerMember.setUname(uname);
		registerMember.setPassword(password);
		registerMember.setEmail(email);
		registerMember.setPhone(phone);
		
		RegisterService registerService=new RegisterService();
		
		 try {
			result=registerService.newRegistration(registerMember);
		} catch (ClassNotFoundException e) {
			
		} catch (IOException e) {
			
		} catch (SQLException e) {
			
		}
		
		 session.setAttribute("Message", result);
		 response.sendRedirect("display.jsp");
		
	}

}  
