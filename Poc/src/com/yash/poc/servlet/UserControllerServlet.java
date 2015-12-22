package com.yash.poc.servlet;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/UserControllerServlet")
public class UserControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		if (request.getParameter("Submit").equalsIgnoreCase("Create")) {
			getServletContext().getRequestDispatcher("/Create.jsp").forward(request, response);
		}
		else if (request.getParameter("Submit").equalsIgnoreCase("Show")) {
			getServletContext().getRequestDispatcher("/ShowUserServlet").forward(request, response);
		}
		else if (request.getParameter("Submit").equalsIgnoreCase("Update")) {
			getServletContext().getRequestDispatcher("/Update.jsp").forward(request, response);
		}
		else if (request.getParameter("Submit").equalsIgnoreCase("Delete")) {
			getServletContext().getRequestDispatcher("/Delete.jsp").forward(request, response);
		}
	}

}
