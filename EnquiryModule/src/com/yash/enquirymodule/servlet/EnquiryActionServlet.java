package com.yash.enquirymodule.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yash.enquirymodule.dao.Registration;
import com.yash.enquirymodule.domain.Enquiry;


@WebServlet("/EnquiryActionServlet")
public class EnquiryActionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Enquiry enquiry=new Enquiry();
		enquiry.setName(request.getParameter("name"));
		enquiry.setUserid((Integer.parseInt(request.getParameter("userid"))));
		enquiry.setEmail((request.getParameter("email")));
		enquiry.setContact((request.getParameter("contact")));
		enquiry.setCourses((request.getParameter("courses")));
		Registration registration=new Registration();
		registration.register1(request,response,enquiry);
	}

}
