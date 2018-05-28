package com.uestc.study_java.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args){
		String springPath = "spring/spring_test.xml";
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(springPath);
		context.start();
		context.registerShutdownHook();
	}
}
