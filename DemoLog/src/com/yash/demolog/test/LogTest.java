package com.yash.demolog.test;



import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.SimpleLayout;
import org.apache.log4j.xml.XMLLayout;

public class LogTest {
	
	static final Logger LOGGER = Logger.getLogger(LogTest.class);
	public void getLog()
	{
		LOGGER.info("Hii From Logging method");
		Appender handler= new FileAppender();
		LOGGER.addAppender(handler);
		//Layout layout=new XMLLayout();
		//handler.setLayout(layout);
	}
}
