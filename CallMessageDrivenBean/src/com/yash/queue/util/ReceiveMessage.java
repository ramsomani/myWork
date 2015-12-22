package com.yash.queue.util;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.MessageConsumer;
import javax.jms.Queue;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.naming.Context;
import javax.naming.InitialContext;

public class ReceiveMessage {
	
	public static String receiveMessageFromQueue(String destinationName) {
		
		String message=null;
		Connection connection =  null;
		
		try {

			Context context = new InitialContext();
			
			ConnectionFactory connectionFactory = (ConnectionFactory) context.lookup("/ConnectionFactory");
			
			Queue queue = (Queue) context.lookup(destinationName);
			
			connection = connectionFactory.createConnection();
			
			Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
			
			MessageConsumer consumer = session.createConsumer(queue);
			
			connection.start();
			
			TextMessage textMessage=(TextMessage) consumer.receive(5000);
			
			message=textMessage.getText();

		}
		catch (Exception exc) {  
			exc.printStackTrace();      
		}
		finally {
			if (connection != null)   {
				try {
					connection.close();
				} catch (JMSException e) {
					e.printStackTrace();
				}
			}    
		}
		return message;
	}
}