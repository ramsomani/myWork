package com.yash.personalizednews.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/NewsControllerServlet")
public class NewsControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			for (Cookie cookie : cookies) {
				if (cookie.getName().equals("cnews")) {
					response.sendRedirect(cookie.getValue() + ".html");
				
				} 
					
			}
			}
		ServletContext application=getServletContext();
		RequestDispatcher rd=application.getRequestDispatcher("/news_home.html");
		rd.forward(request, response);
		
		}
	}

