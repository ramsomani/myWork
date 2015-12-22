package com.yash.enquirymodule.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.yash.enquirymodule.dao.CheckLogin;

import com.yash.enquirymodule.domain.User;

@WebServlet("/LoginActionServlet")
public class LoginActionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		User user=new User();
		user.setUsername(name);
		user.setPassword(password);
		CheckLogin checkLogin=new CheckLogin();
		int id=checkLogin.check(user);
		System.out.println(id);
		HttpSession session=request.getSession();
		session.setAttribute("userid", id);
		request.getRequestDispatcher("/View.jsp").forward(request, response);
		
		
	}

}
