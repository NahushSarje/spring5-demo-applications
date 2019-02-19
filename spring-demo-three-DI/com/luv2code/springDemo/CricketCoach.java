package com.luv2code.springDemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	public CricketCoach() {
		System.out.println("Cricket Coach: no-arg Constructor.");
	}
	
	// Added setter for setter DI
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Cricket Coach: inside setter method setFortuneService.");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Spent 30 min for fast bowling today.";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
