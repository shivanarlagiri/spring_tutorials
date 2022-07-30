package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigurationAnnotationDemoApp {

	public static void main(String[] args) {

		// read spring config file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportsConfiguration.class);

		// get the bean from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);

		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());

		// call a method to get the dailyFortune.
		System.out.println(theCoach.getDailyFortune());

		// get the bean from spring container
		Coach swimCoach = context.getBean("swimCoach", Coach.class);

		// call a method on the bean
		System.out.println(swimCoach.getDailyWorkout());

		// call a method to get the dailyFortune.
		System.out.println(swimCoach.getDailyFortune());

		// close the context.
		context.close();

	}

}
