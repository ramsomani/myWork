package com.yash.personalizednews.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/NewsPersonalizeServlet")
public class NewsPersonalizeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String str = request.getParameter("news");
		Cookie cookie = new Cookie("cnews", str);
		cookie.setMaxAge(60);
		response.addCookie(cookie);
		response.sendRedirect("NewsControllerServlet");
	}
}
