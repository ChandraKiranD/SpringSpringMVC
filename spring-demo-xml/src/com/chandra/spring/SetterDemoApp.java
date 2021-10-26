package com.chandra.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");

		CricketCoach theCoach = 
				context.getBean("myCricketCoach", CricketCoach.class);

		System.out.println(theCoach.getDailyWorkout() 
				+ "\n" + theCoach.getDailyFortune());
		
		System.out.println("Email Address: " 
		+ theCoach.getEmailAddress() +"\nTeam: "+ theCoach.getTeam());

		context.close();
	}

}
