package com.yash.itservicedesk.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<title>");
		out.println("</title>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		out.println("<form action='GetDetailsServlet' method='post'>");
		out.println("<table>");
		out.println("<tr>");
		out.println("<td> Name </td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td><input type='text' name='name'></td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td> LastName </td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td><input type='text' name='lastname'> </td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td> Contact </td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td><input type='text' name='contact'> </td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td><input type='submit' name='submit'> </td>");
		out.println("</tr>");
		out.println("</table>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
		
	}

}
