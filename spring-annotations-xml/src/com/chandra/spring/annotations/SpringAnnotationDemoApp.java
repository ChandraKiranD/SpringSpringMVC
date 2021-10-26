package com.chandra.spring.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAnnotationDemoApp {

	public static void main(String[] args) {
		
		//read spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get bean from spring container
		Coach theCoach = context.getBean("skatingCoach",Coach.class);
		/* Default bean ID is the class name with first character in lower case*/
		
		//call methods
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getFortune());
		System.out.println(theCoach.getMailAndTeam());
		
		//close context
		context.close();
	}

}
