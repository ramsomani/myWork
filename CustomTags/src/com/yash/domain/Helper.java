package com.yash.domain;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Helper {
	public static void doProcess(HttpServletRequest request,HttpServletResponse response, Customer customer)
	{
		String name;
		String city;
		name=customer.getName();
		city=customer.getCity();
		System.out.println(name);
		System.out.println(city);
		request.setAttribute("customer", customer);
		try {
			request.getRequestDispatcher("/view.jsp").forward(request, response);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
