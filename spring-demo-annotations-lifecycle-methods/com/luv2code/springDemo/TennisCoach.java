package com.luv2code.springDemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("tennisCoach")  //Specifying bean Id
@Component                // Bean Id here would class name with first letter lowercase
public class TennisCoach implements Coach {

	@Autowired        // Require for Field DI - it uses Reflection inside to inject into field
	private FortuneService fortuneService;
	
	public TennisCoach() {
		System.out.println("Inside Tennis Coach no-arg constructor.");
	}
	
	/*@Autowired     //Require for Constructor DI
	public TennisCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}*/

	/*@Autowired      // Require for setter DI
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside Tennis Coach setFortuneService method.");
		this.fortuneService = fortuneService;
	}*/
	
	/*@Autowired      // Require for method DI
	public void doThingsForFortune(FortuneService fortuneService) {
		System.out.println("Inside Tennis Coach doThingsForFortune method.");
		this.fortuneService = fortuneService;
	}*/

	@Override
	public String getDailyWorkout() {
		
		return "Today work on your backhand.";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}
	
	// init method
	@PostConstruct
	public void doInit() {
		System.out.println("Tennis Coach: inside doInit()");
	}

	// destroy method
	@PreDestroy
	public void doDestroy() {
		System.out.println("Tennis Coach: inside doDestroy()");
	}
}
