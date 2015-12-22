package com.yash.firstservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/MyServlet3")
public class MyServlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String even="";
		String odd="";
		
		for(int i=1;i<50;i++)
		{
			if(i%2==0)
			{
				even=even+i+" ";
			}
			else if(i%2!=0)
			{
			odd=odd+i+" ";
			}
		}
		out.print(even+"<br>");
		out.print(odd);
	}

}
