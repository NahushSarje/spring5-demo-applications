package com.luv2code.springDemo;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		
		return "Today is very sad day.";
	}

}
