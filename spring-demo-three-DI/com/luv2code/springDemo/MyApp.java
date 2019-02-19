package com.luv2code.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		
		//Load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Retrieve bean from spring container
		//Coach theCoach = context.getBean("myCoach", Coach.class);   // This enables constructor DI
		//Coach theCoach = context.getBean("myCricketCoach", Coach.class); // This enables setter DI
		
		/* Belove code enables setter of primitive values
		 * as well as setter DI
		 * CricketCoach class used instead of the Coach interface 
		 * The Coach interface has two methods: getDailyWorkout and getDailyFortune
		 * The CricketCoach class has four methods: getDailyWorkout, getDailyFortune, getTeam and setTeam
		 * */
		CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
		
		//use object
		System.out.println(theCoach.getDailyWorkout());
		
		// Print method which involve in Constructor DI
		System.out.println(theCoach.getDailyFortune());
		
		//Print primitives
		System.out.println(theCoach.getEmailAddress());
		System.out.println(theCoach.getTeam());
		
		//Close context
		context.close();
	}

}
