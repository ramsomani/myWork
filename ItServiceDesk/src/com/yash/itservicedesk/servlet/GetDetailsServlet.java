package com.yash.itservicedesk.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yash.itservicedesk.dao.SaveDetails;
import com.yash.itservicedesk.domain.Register;


@WebServlet("/GetDetailsServlet")
public class GetDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String lname=request.getParameter("lastname");
		String contact=request.getParameter("contact");
		Register register=new Register();
		register.setName(name);
		register.setLname(lname);
		register.setContact(contact);
		SaveDetails.save(register);
		ServletContext application =getServletContext();
		RequestDispatcher requestDispatcher=application.getRequestDispatcher("/ResponseServlet");
		requestDispatcher.forward(request, response);
	}                                                                                                                                                        

}
