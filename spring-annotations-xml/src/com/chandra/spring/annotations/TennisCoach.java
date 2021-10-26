package com.chandra.spring.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	/*Field injection - Used directly on the field*/
	@Autowired
	@Qualifier("fileFortuneService")
	private FortuneService fortuneService;
	
	public TennisCoach() {
		System.out.println("::: Inside TennisCoach default constructor :::");
	}
	
	//Define my initial method
	@PostConstruct
	public void doMyInitStuff() {
		System.out.println("::: TennisCoach - Inside doMyInitStuff() :::");
	}
	
	//Define my destroy method
	@PreDestroy
	public void doMyCleanUpStuff() {
		System.out.println(":::TennisCoach - Inside doMyCleanUpStuff() :::");
		
	}
	
	/* Setter injection
	 * @Autowired public void setFortuneService(FortuneService fortuneService) {
	 * System.out.println("::: inside setter method :::"); this.fortuneService =
	 * fortuneService; }
	 */
	
	/*Method Injection - We can use any method for dependency injection*/
	/*
	 * @Autowired public void doMyStuff(FortuneService theFortuneService) {
	 * System.out.println("::: inside setter method :::"); fortuneService =
	 * theFortuneService; }
	 */

	/* Constructor injection
	 * @Autowired public TennisCoach(FortuneService theFortuneService) {
	 * fortuneService = theFortuneService; }
	 */
	
	@Override
	public String getDailyWorkout() {
		return "Practice backhand 30 minutes everyday!";
	}

	@Override
	public String getFortune() {
		return fortuneService.getFortune();
	}

	@Override
	public String getMailAndTeam() {
		// TODO Auto-generated method stub
		return null;
	}

}
