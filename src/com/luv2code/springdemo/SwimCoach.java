package com.luv2code.springdemo;

public class SwimCoach implements Coach {

	// define a private field for the dependency
	private FortuneService fortuneService;

	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Swim 5x100 meters freestyle on 1 minute and 30 seconds.";
	}

	@Override
	public String getDailyFortune() {
		System.out.println("Just Do It");
		return fortuneService.getFortune();
	}
}
