package com.yash.demoejb.servlet;

import java.io.IOException;


import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yash.demoejb.bean.UserServiceBeanLocal;


@WebServlet("/CurrencyConvertorServlet")
public class CurrencyConvertorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public CurrencyConvertorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    @EJB
    private UserServiceBeanLocal userServiceBeanLocal;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int amount=Integer.parseInt(request.getParameter("amount"));
		System.out.println(amount);
		int result=userServiceBeanLocal.convert(amount);
		System.out.println(result);
		response.getWriter().write(result);
		
	}

}
