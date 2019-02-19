package com.luv2code.springDemo;

public class BaseballCoach implements Coach {
	
	private FortuneService fortuneService;
	
	// Constructor dependency injection
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Spend 40 min of practive with ball daily.";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}
}
