package com.sync.api;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.web.context.request.RequestContextListener;

@EnableRabbit
@SpringBootApplication
public class SyncApplication {

	public static void main(String[] args) {
		SpringApplication.run(SyncApplication.class, args);
	}

	@Bean
	public ServletListenerRegistrationBean<RequestContextListener> registerRequestContextListener() {
		return new ServletListenerRegistrationBean<>( new RequestContextListener() );
	}

}
