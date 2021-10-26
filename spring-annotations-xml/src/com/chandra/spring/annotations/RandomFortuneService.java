package com.chandra.spring.annotations;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	//Array of strings 
	private String[] data = 
		{"Lucky day!",
		 "All theh best!",
		 "Best of Luck!"};
	
	private Random myRandom = new Random();
	
	@Override
	public String getFortune() {
		
		//Pick a random fortune
		int index = myRandom.nextInt(data.length);
		
		String theFortune = data[index];
		
		return theFortune;
	}

}
