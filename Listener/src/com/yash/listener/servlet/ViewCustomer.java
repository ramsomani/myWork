package com.yash.listener.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ViewCustomer")
public class ViewCustomer extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String title;
		Properties properties = (Properties) getServletContext().getAttribute(
				"properties");
		title=properties.getProperty("title");
		PrintWriter out=response.getWriter();
		out.println(title);
		
	}

}
