package com.yash.itservicedesk.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import javax.servlet.http.HttpSession;

import com.yash.itservicedesk.dao.CheckDetails;

@WebServlet("/TechSupportServlet")
public class TechSupportServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request,
		HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		CheckDetails details = new CheckDetails();
		int ch = details.check(email);
		HttpSession session=request.getSession();
		session.setAttribute("EmailId", email);
		if (ch == 1) {
			ServletContext application =getServletContext();
			RequestDispatcher requestDispatcher=application.getRequestDispatcher("/ResponseServlet");
			requestDispatcher.forward(request, response);
		} else {
			ServletContext application =getServletContext();
			RequestDispatcher requestDispatcher=application.getRequestDispatcher("/RegisterServlet");
			requestDispatcher.forward(request, response);
			
		}
		

	}

}
