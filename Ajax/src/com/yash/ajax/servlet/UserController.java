package com.yash.ajax.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.yash.ajax.dao.UserData;
import com.yash.ajax.domain.User;

@WebServlet("/UserController")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		User user = new User();
		UserData getdata = new UserData();
		int str = Integer.parseInt(request.getParameter("id"));
		user = getdata.getData(str);
		response.setContentType("application/json");
		Gson gson = new Gson();
		// response.getWriter( ).println(gson.toJson(user));
		String users = gson.toJson(user);
		System.out.println(users);
		response.getWriter().write(users.toString());
		// out.println(user.getId());
		// request.setAttribute("users",users);
		//response.getWriter().write(users.toString());
	}

}
