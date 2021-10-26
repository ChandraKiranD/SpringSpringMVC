package com.chandra.spring.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		//load spring configuration file
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//get spring bean from spring container
		Coach theCoach = context.getBean("badmentonCoach",Coach.class);
		Coach theCoach1 = context.getBean("skatingCoach",Coach.class);
		Coach theCoach2 = context.getBean("TTCoach",Coach.class);
		System.out.println(context.getAutowireCapableBeanFactory());
		
		//call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach1.getDailyWorkout());
		System.out.println(theCoach2.getDailyWorkout());

		
		//call method to get daily fortune
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach1.getDailyFortune());
		System.out.println(theCoach2.getDailyFortune());

		
		//close bean
		context.close();

	}

}
