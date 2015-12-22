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

import javax.servlet.http.HttpServletRequest;


@WebFilter(urlPatterns="/*")
public class CheckURL implements Filter {

	public void destroy() {
		// TODO Auto-generated method stub
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("filter 1");
		PrintWriter out=response.getWriter();
			String url = ((HttpServletRequest) request).getRequestURL().toString();
			 System.out.println(url);
			 int index=url.lastIndexOf(".");
			 System.out.println(index);
			if(index==-1 ){
				out.println("INVALID");
			 }
			else{ 
			 String str=url.substring(index);
			 System.out.println(str);
			 if(str.equalsIgnoreCase(".do")|| str.equalsIgnoreCase(".html"))
			 {
				 chain.doFilter(request, response);
			 }
			 else{
				 out.println("INVALID");
			 }
			}
			 
				 
			
	}
		
	

	
	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
