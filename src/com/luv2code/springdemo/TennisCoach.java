package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//Spring will automatically register the bean with below quoted bean id.
//@Component("thatSillyCoach")
//Spring will automatically register the bean with default bean id.
@Component
//@Scope("prototype")
public class TennisCoach implements Coach {

	private FortuneService fortuneService;
	
	/*//Field Injection
	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;*/

	/*//constructor injection.
	@Autowired
	public TennisCoach(FortuneService theFortuneService) {
		fortuneService=theFortuneService;
	}*/

	
	@Autowired
	public TennisCoach(@Qualifier("happyFortuneService")
				FortuneService theFortuneService) {
		System.out.println("inside the constructor DI");
		fortuneService=theFortuneService;
	}

	public TennisCoach() {
		System.out.println("inside the default constructor");
	}

	/*	//setter injection
	@Autowired
	public void setFortuneService(FortuneService theFortuneService) {
		System.out.println("inside the setFortuneService method");
		fortuneService=theFortuneService;
	}
	 */

	/*//method injection
	@Autowired
	public void myMethodInjection(FortuneService theFortuneService) {
		System.out.println("inside the myMethodInjection method");
		fortuneService=theFortuneService;
	}*/

	@Override
	public String getDailyWorkout() {

		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {

		return fortuneService.getFortune();
	}
	
	
	@PostConstruct
	public void doMyStartupStuff() {
		
		System.out.println("PostConstruct::: inside the doMyStartupStuff method");
	}

	@PreDestroy
	public void doMyCleanUpStuff() {
		System.out.println("PreDestroy::: inside the doMyCleanUpStuff method");
	}
}
