package com.yash.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.PrintWriter;

import com.yash.queue.util.ReceiveMessage;
import com.yash.queue.util.SendMessage;

@WebServlet("/CallQueue")
public class CallQueue extends HttpServlet {
	
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public CallQueue() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
		{

			
			PrintWriter out=response.getWriter();
			
			String name=request.getParameter("name");
			
			SendMessage.sendMessageOnQueue("queue/yashReqQueue", name);
			
			out.print("My name is:-  "+name);
				
			String messageReceived= ReceiveMessage.receiveMessageFromQueue("queue/yashResQueue");
			 
			out.print("<br/>Recived message from queue is: "+messageReceived);
			
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
