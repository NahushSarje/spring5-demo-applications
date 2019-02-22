package com.luv2code.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotaionDemoApp {

	public static void main(String[] args) {
		
		//Read Spring Config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Get the bean from spring container.
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class); // second obj
		
		//Call the method on bean
		System.out.println(theCoach == alphaCoach);
		System.out.println(theCoach);
		System.out.println(alphaCoach);
		
		//close context
		context.close();
	}

}
