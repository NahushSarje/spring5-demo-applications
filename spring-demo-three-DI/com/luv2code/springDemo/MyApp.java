package com.luv2code.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		
		//Load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Retrieve bean from spring container
		//Coach theCoach = context.getBean("myCoach", Coach.class);   // This enables constructor DI
		Coach theCoach = context.getBean("myCricketCoach", Coach.class); // This enables setter DI
		
		//use object
		System.out.println(theCoach.getDailyWorkout());
		
		// Print method which involve in Constructor DI
		System.out.println(theCoach.getDailyFortune());
		
		//Close context
		context.close();
	}

}
