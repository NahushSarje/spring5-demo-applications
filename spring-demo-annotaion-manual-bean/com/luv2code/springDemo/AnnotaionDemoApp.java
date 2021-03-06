package com.luv2code.springDemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotaionDemoApp {

	public static void main(String[] args) {
		
		//Read Spring Config file
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportsConfig.class);
		
		//Get the bean from spring container.
		//Coach theCoach = context.getBean("tennisCoach", Coach.class);
		Coach theCoach = context.getBean("swimCoach", Coach.class);
		
		//Call the method on bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		//close context
		context.close();
	}

}
