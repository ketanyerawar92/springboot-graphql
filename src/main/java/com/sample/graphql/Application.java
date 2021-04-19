package com.sample.graphql;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

@ComponentScan({ "com.sample.graphql" })
@EnableAsync
@EnableAutoConfiguration
public class Application extends org.springframework.boot.web.servlet.support.SpringBootServletInitializer {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(Application.class);
	}

}