package com.javainuse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringBootHelloWorldApplication extends SpringBootServletInitializer {

	protected SpringApplicationBuilder configure(SpringApplicationBuilder application)
	  {
	    return application.sources(new Class[] { SpringBootHelloWorldApplication.class });
	  }

	  public static void main(String[] args) {
	    SpringApplication.run(SpringBootHelloWorldApplication	.class, args);
	  }
}
