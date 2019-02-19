package com.luv2code.springDemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	
	public CricketCoach() {
		System.out.println("Cricket Coach: no-arg Constructor.");
	}
	
	// Added setter for setter DI
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Cricket Coach: inside setter method setFortuneService.");
		this.fortuneService = fortuneService;
	}

	// Added setters and getters for primitives
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("Cricket Coach: inside setter method setEmailAddress.");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("Cricket Coach: inside setter method setTeam.");
		this.team = team;
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
