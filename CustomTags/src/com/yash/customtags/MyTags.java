package com.yash.customtags;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class MyTags extends TagSupport {
	String type;
	String name;
	String value;

	public void setType(String type) {
		this.type = type;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public int doStartTag() throws JspException {
		try {

			JspWriter out = pageContext.getOut();
			out.println("<input type=" + type + "  "  + "name=" + name + "  "+  "value=" + value + ">");
		} catch (Exception ioException) {
			System.err.println("IO Exception");
			System.err.println("ioException.toString()");
		}
		return SKIP_BODY;
	}

}
