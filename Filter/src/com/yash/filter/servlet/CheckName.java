package com.yash.filter.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;


@WebFilter(urlPatterns="/CheckServlet.do")
public class CheckName implements Filter {

  
	public void destroy() {
		
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("filter ");
		String str=request.getParameter("value1");
		if(str.equalsIgnoreCase("ram"))
		chain.doFilter(request, response);
		else{
			PrintWriter out=response.getWriter();
			out.println("INVALID");
		}
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
