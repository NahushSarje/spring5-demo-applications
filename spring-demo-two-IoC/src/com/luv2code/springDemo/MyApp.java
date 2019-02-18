package com.luv2code.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		
		//Load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		//use object
		System.out.println(theCoach.getDailyWorkout());
		
		//Close context
		context.close();
	}

}
