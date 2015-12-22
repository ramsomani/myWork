package com.yash.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yash.dao.Customer_dao;
import com.yash.domain.Customer;

@WebServlet("/CustomerServlet")
public class CustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String str = request.getParameter("value");
		if (str.equalsIgnoreCase("")) {
			List<Customer> list = new ArrayList<Customer>();
			list = Customer_dao.getAll();
			request.setAttribute("customer", list);
			RequestDispatcher rd = request.getRequestDispatcher("view.jsp");
			rd.forward(request, response);

		} else {
			List<Customer> list = new ArrayList<Customer>();
			list = Customer_dao.get(str);
			request.setAttribute("customer", list);
			RequestDispatcher rd1 = request.getRequestDispatcher("view.jsp");
			rd1.forward(request, response);
		
		}
	}

}
