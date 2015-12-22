package com.yash.queue.util;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.Queue;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.naming.Context;
import javax.naming.InitialContext;

public class SendMessage {

	public static void sendMessageOnQueue(String destinationName,String text) {
		
		Connection connection =  null;

		try {
			
			/**
			 * It will initialize the jndi name from server.
			 */
			Context context = new InitialContext();
			
			/**
			 * Create connection factory object from lookup and which will provide connection object.
			 */
			
			ConnectionFactory connectionFactory = (ConnectionFactory) context.lookup("/ConnectionFactory");
			
			/**
			 * Get object of queue whose entry is present in server.
			 */
			Queue queue = (Queue) context.lookup(destinationName);
			
			/**
			 * Get connection object from it's factory.
			 */
			connection = connectionFactory.createConnection();
			
			/**
			 * create session with auto acknowledge
			 */
			Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
			
			/**
			 * create message producer for queue
			 */
			MessageProducer producer = session.createProducer(queue);
			
			/**
			 * start connection from server
			 */
			connection.start();
		
			/**
			 * Prepare text message object. 
			 */
			TextMessage message = session.createTextMessage(text);
			
			/**
			 * send message on queue.
			 */
			producer.send(message); 
			
		}
		catch (Exception exc) {  
			exc.printStackTrace();      
		}
		finally {
			
			if (connection != null) {
				
				try {
					connection.close();
				} catch (JMSException e) {
					e.printStackTrace();
				}
			}    
		}
	}
}