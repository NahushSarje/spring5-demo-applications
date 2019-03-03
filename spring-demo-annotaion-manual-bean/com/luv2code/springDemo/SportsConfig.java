package com.luv2code.springDemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.luv2code.springDemo")     //Automatically assigning beans
public class SportsConfig {

	// Manually Defining beans here instead of @ComponentScan
	// Define bean for our sad fortune service
	@Bean
	public FortuneService sadFortuneService() {
		
		return new SadFortuneService();
	}
	
	// Define bean for swim coach and define injection
	@Bean
	public Coach swimCoach() {
		
		return new SwimCoach(sadFortuneService()); // Calling method defined at top
	}
}
