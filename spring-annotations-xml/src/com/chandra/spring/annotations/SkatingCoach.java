package com.chandra.spring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SkatingCoach implements Coach {
	
	private FortuneService fortuneService;
	
	@Value("${coach.email}")
	private String email;
	
	@Value("${coach.team}")
	private String team;
	
	/*Constructor Injection*/
	@Autowired
	public SkatingCoach(@Qualifier("randomFortuneService") FortuneService theFortuneService) {
		System.out.println("::: Inside SkatingCoach default constructor :::");
		fortuneService = theFortuneService;
	}

	@Override
	public String getMailAndTeam() {
		return "email: " + email + "Team: " + team;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practive speed skating everyday!";
	}

	@Override
	public String getFortune() {
		return fortuneService.getFortune();
	}
	
	
}
