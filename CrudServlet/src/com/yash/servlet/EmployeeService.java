package com.yash.servlet;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.yash.dao.EmployeeDao;
import com.yash.domain.Employee;


@WebServlet("/EmployeeService")
public class EmployeeService extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public EmployeeService() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String check=request.getParameter("submit");
		System.out.println(check);
		int a=10;
		if(check.equalsIgnoreCase("add")){
		Employee employee=new Employee();
		employee.setName(request.getParameter("name"));
		employee.setContact(request.getParameter("contact"));
		EmployeeDao.create(employee);
		a++;
		System.out.println(a);
		response.sendRedirect("index.jsp");
		}
		
		 if(check.equalsIgnoreCase("display"))
		{
			 System.out.println("in display");
			request.getRequestDispatcher("display.jsp").forward(request, response);
			
		}
		 if(check.equalsIgnoreCase("update"))
		{
			 System.out.println("in update");
			//request.getRequestDispatcher("update.jsp").forward(request, response);
			 response.sendRedirect("display.jsp");
		}
		if(check.equalsIgnoreCase("delete")) 
		{	
			System.out.println("in delete");
			//request.getRequestDispatcher("delete.jsp").forward(request, response);
			response.sendRedirect("delete.jsp");
		}
		if(check.equalsIgnoreCase("ShowUser")){
			System.out.println("in show");
			Employee employee=new Employee();
			String q=request.getParameter("id");
			System.out.println(q);
			int str=Integer.parseInt(q);
			employee=EmployeeDao.display(str);
			HttpSession session=request.getSession(true);
			session.setAttribute("employee", employee);
			request.getRequestDispatcher("display.jsp").forward(request, response);
		}
		
		if(check.equalsIgnoreCase("DeleteUser")){
			System.out.println("in delete");
			String q=request.getParameter("id");
			System.out.println(q);
			int str=Integer.parseInt(q);
			EmployeeDao.delete(str);
			response.sendRedirect("delete.jsp");	
		}
		if(check.equalsIgnoreCase("UpdateUser")){
			System.out.println("in update");
			Employee employee=new Employee();
			employee.setName(request.getParameter("name"));
			employee.setContact(request.getParameter("contact"));
			employee.setId(Integer.parseInt(request.getParameter("id")));
			EmployeeDao.update(employee);
			response.sendRedirect("update.jsp");
		}
		if(check.equalsIgnoreCase("GoBack")){
			response.sendRedirect("index.jsp");
		}
		
	}

	
	
}
