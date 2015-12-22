package com.yash.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/NextServlet")
public class NextServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("html/text");
		out.println("<html>");
		out.println("<body>");
		HttpSession session = request.getSession(false);
		int sum = (int) session.getAttribute("sum");
		int sum1=0;
		if (request.getParameter("value3") != null) {
			sum1 = Integer.parseInt(request.getParameter("value3"));
			sum = sum + sum1;
			session.setAttribute("sum", sum);
		}
		else {
			session.setAttribute("sum", sum);
		}
		out.println("<form action='NextServlet' method='get'>");
		out.println("<table>");
		out.println("<tr>");
		out.println(sum);
		out.println("<td> Enter any</td>");
		out.println("<td><input type='text' name='value3'></td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td><input type='submit' value='OK'> </td>");
		out.println("</tr>");
		out.println("</table>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
	}

}
