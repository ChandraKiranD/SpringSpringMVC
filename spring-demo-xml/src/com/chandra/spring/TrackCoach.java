package com.chandra.spring;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run 10k Track daily";
	}

	@Override
	public String getDailyFortune() {
		return "Just do it.. " + fortuneService.getFortune();
	}
	
	//Init method
	public void theInitMethod() {
		System.out.println("::: Track Coach - theInitMethod() :::");
	}
	
	//destroy method
	public void theClaenupMethod() {
	System.out.println("::: track Coach - theClaenupMethod() :::");	
	}
}
