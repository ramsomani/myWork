package com.yash.enquirymodule.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yash.enquirymodule.dao.Registration;
import com.yash.enquirymodule.domain.User;


@WebServlet("/RegistrationActionServlet")
public class RegistrationActionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User user=new User();
		user.setName(request.getParameter("name"));
		user.setEmail(request.getParameter("email"));
		user.setType(Integer.parseInt(request.getParameter("type")));
		user.setStatus(Integer.parseInt(request.getParameter("status")));
		user.setUsername(request.getParameter("username"));
		user.setPassword(request.getParameter("password"));
		Registration registration=new Registration();
		registration.register(request,response,user);
		
	}
		


}
