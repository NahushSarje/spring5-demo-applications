package com.luv2code.springDemo;

public class SwimCoach implements Coach {

	private FortuneService fortuneService;
	
	public SwimCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Swim 1000 m as a warm up.";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
