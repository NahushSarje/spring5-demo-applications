package com.luv2code.springDemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Spend time on running 4km daily.";
	}
	
	@Override
	public String getDailyFortune() {
		
		return "Just Do it: " + fortuneService.getFortune();
	}

}
