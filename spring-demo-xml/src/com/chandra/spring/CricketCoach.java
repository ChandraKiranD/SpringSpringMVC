package com.chandra.spring;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	
	public void setEmailAddress(String emailAddress) {
		System.out.println("::: Inside setEmailAddress() method :::");
		this.emailAddress = emailAddress;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("::: Inside setTeam() methos :::");
		this.team = team;
	}

	public CricketCoach() {
		System.out.println("::: Inside CricketCoach default constructor :::");
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("::: Inside setter method - setFortuneService() :::");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice fast bowling!";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
