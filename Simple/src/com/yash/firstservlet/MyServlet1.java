package com.yash.firstservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MyServlet1")
public class MyServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		int first = 0;
		int second = 1;
		int third;
		PrintWriter out = response.getWriter();
		out.println(first);
		out.println(second);
		for (int i = 1; i < 5; i++) {
			third = first + second;
			out.println(third);
			first = second;
			second = third;
		}

	}

}
