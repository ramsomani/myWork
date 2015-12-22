package com.yash.listener.servlet;


import java.io.FileReader;

import java.util.Properties;


import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyListener implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void contextInitialized(ServletContextEvent context) {

		
		FileReader reader = null;
		try {
			
			String path=context.getServletContext().getInitParameter("File");
			System.out.println(path);
			String url = context.getServletContext().getRealPath(path);
			System.out.println(url);
			reader = new FileReader(url);
			Properties properties = new Properties();
			properties.load(reader);
			context.getServletContext().setAttribute("properties", properties);
			
		}

		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
