package com.melvin.tonia.tutorial.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.melvin.tonia.tutorial.service.CustomerService;
import com.melvin.tonia.tutorial.service.CustomerServiceImpl;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext appContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		CustomerService service =  appContext.getBean("customerService", CustomerService.class);
		System.out.println(service.getAll().get(0).getLastName());
	}

}
