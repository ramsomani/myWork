package com.yash.listener.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginCustomer")
public class LoginCustomer extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		PrintWriter printWriter = response.getWriter();
		String id, name;
		Properties properties = (Properties) getServletContext().getAttribute(
				"properties");
		id = properties.getProperty("Customer.id");
		name = properties.getProperty("Customer.password");
		printWriter.println("<html>");
		printWriter.println("<body>");
		printWriter.println("<form action='ViewCustomer' method='get'>");
		printWriter.println("<table>");
		printWriter.println("<tr>");
		printWriter.println("<td>");
		printWriter.println(id);
		printWriter.println("</td>");
		printWriter.println("<td>");
		printWriter.println("<input type='text' name='id'>");
		printWriter.println("</td>");
		printWriter.println("</tr>");
		printWriter.println("<tr>");
		printWriter.println("<td>");
		printWriter.println(name);
		printWriter.println("</td>");
		printWriter.println("<td>");
		printWriter.println("<input type='text' name='name'>");
		printWriter.println("</td>");
		printWriter.println("</tr>");
		printWriter.println("<tr>");
		printWriter.println("<td>");
		printWriter.println("<input type='submit' value='Submit'>");
		printWriter.println("</td>");
		printWriter.println("</tr>");
		printWriter.println("</table>");
		printWriter.println("</form>");
		printWriter.println("</body>");
		printWriter.println("</html>");
	}

}
