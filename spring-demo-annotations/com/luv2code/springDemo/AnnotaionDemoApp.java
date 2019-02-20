package com.luv2code.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotaionDemoApp {

	public static void main(String[] args) {
		
		//Config Context
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Get the bean
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		//Call the method on bean
		System.out.println(theCoach.getDailyWorkout());
		
		//close context
		context.close();
	}

}
