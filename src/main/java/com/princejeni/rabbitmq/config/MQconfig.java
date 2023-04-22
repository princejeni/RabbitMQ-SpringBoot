package com.princejeni.rabbitmq.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MQconfig {
	
	@Bean
	public Queue queue() {
		return new Queue("my_queue");
	}
	
	@Bean
	public TopicExchange exchange() {
		return new TopicExchange("my_exchange");
	}
	
	@Bean
	public Binding binding() {
		return BindingBuilder.bind(queue())
				.to(exchange())
				.with("my_routing_key");
	}
	

}
