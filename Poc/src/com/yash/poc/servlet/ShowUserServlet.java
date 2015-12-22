package com.yash.poc.servlet;

import java.io.IOException;




import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yash.poc.domain.User;
import com.yash.poc.service.UserServiceIntf;



@WebServlet("/ShowUserServlet")
public class ShowUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Inject 
	UserServiceIntf userServiceIntf;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<User> list=new ArrayList<User>();
		list=userServiceIntf.ShowUser();
		request.setAttribute("user", list);
		getServletContext().getRequestDispatcher("/Show.jsp").forward(request, response);
	}

}
