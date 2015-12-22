package com.yash.poc.servlet;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yash.poc.domain.User;
import com.yash.poc.service.UserServiceIntf;

@WebServlet("/UpdateUserServlet")
public class UpdateUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Inject 
	UserServiceIntf userServiceIntf;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("id"));
		String name=request.getParameter("name");
		String location=request.getParameter("location");
		User user=new User();
		user.setId(id);
		user.setName(name);
		user.setLocation(location);
		userServiceIntf.UpdateUser(user);
		getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
		
		
	}

}
