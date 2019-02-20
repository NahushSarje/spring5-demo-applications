package com.luv2code.springDemo;

import org.springframework.stereotype.Component;

//@Component("tennisCoach")  //Specifying bean Id
@Component                // Bean Id here would class name with first letter lowercase
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		
		return "Today work on your backhand.";
	}

}
