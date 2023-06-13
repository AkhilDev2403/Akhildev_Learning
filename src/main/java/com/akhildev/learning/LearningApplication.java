package com.akhildev.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.akhildev.learning.controller.web.MyWebController;

@SpringBootApplication
public class LearningApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context 
		 = SpringApplication.run(LearningApplication.class, args);
		System.out.println("How you doin ?");
		MyWebController controller =  context.getBean(MyWebController.class);
		System.out.println(controller.returnValueFromBusinessService());
	}

}
