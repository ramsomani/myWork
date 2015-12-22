package com.yash.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SumServlet")
public class SumServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
@Override
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		int str = Integer.parseInt(request.getParameter("value1"));
		int str1 = Integer.parseInt(request.getParameter("value2"));
		int sum = str + str1;
		session.setAttribute("sum", sum);
		getServletContext().getRequestDispatcher("/NextServlet").forward(request, response);
	}
}
