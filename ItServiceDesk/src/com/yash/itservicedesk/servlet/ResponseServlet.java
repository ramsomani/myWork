package com.yash.itservicedesk.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/ResponseServlet")
public class ResponseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request,
		HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		HttpSession session=request.getSession();
		String str=(String) session.getAttribute("EmailId");
		out.println("<html>");
		out.println("<title>");
		out.println("</title>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		out.println("<header>");
		out.println("<p>Welcome to Yash</p>");
		out.println("</header>");
		out.println("<p>Thank You</br>Your Details are submitted</p>");
		out.println(str);
		out.println("<footer>");
		out.println("<p>Copyright@yash.com</p>");
		out.println("</footer>");
		out.println("</body>");
		out.println("</html>");
	}

}
