package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach {

	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	
	@Override
	public String getDailyWorkout() {
	
		return "the following team "+team +" with email "+email+" got top";
	}

	@Override
	public String getDailyFortune() {
		// 
		return "Today is my lucky swimming day";
	}

}
