package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		
		//create the spring container: context
		ClassPathXmlApplicationContext context=
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get the coach bean
		Coach theCoach=context.getBean("tennisCoach", Coach.class);
		
		Coach newCoach=context.getBean("tennisCoach", Coach.class);
		
		boolean result=(theCoach==newCoach);

		System.out.println("Is the coaches are same "+result);
		
		System.out.println("the toString of theCoach :: "+theCoach);
		
		System.out.println("the toString of newCoach :: "+newCoach);
	}

}
