package com.princejeni.rabbitmq.controller;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.princejeni.rabbitmq.sender.MQsender;

@RestController
@EnableRabbit
public class MQcontroller {
	
	@Autowired
	MQsender mqSender;
	
	@PostMapping("/publish")
	public String sendMessage(@RequestBody String message) {
		
		mqSender.sendMessage(message);
		return "message published successfully";
	}

}
