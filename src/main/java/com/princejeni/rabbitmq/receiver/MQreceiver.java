package com.princejeni.rabbitmq.receiver;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class MQreceiver {
	
	@RabbitListener(queues = {"my_queue"})
	public void receiveMessage(@Payload String message) {
		System.out.println("Received Message -> "+message);
	}

}
