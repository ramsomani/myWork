package com.yash.queue.test;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import com.yash.queue.util.SendMessage;

@MessageDriven(name = "MessageMDBSample", activationConfig = { 
		@ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue"),
		@ActivationConfigProperty(propertyName = "destination", propertyValue = "queue/yashReqQueue"),
		@ActivationConfigProperty(propertyName = "acknowledgeMode", propertyValue = "Auto-acknowledge") })

public class QueueConcept implements MessageListener {

	public void onMessage(Message message) {
		
		System.out.println("Entered into on message of queue");
		
		TextMessage tm = (TextMessage) message;

		try {
			
			System.out.println("Queue message is: "+tm.getText());
			
			SendMessage.sendMessageOnQueue("queue/yashResQueue", "Hi "+tm.getText());
			
		} catch (JMSException e) {
			e.printStackTrace();
		}
	}
}