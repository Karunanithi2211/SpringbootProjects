package com.nivak.base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
 
@SpringBootApplication
public class BaseApplication {


	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(BaseApplication.class, args);

		Home h=context.getBean(Home.class);
		h.connect();
		
		Home h1=context.getBean(Home.class);
		h1.connect();
	} 

}
 