package com.chandra.spring.annotations;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class FileFortuneService implements FortuneService {
	
	ArrayList<String> fortuneList = new ArrayList<>();

	private Random myRandom = new Random();
	
	@Override
	public String getFortune() {
		
		int index = myRandom.nextInt(fortuneList.size());
		
		String theFortune = fortuneList.get(index);
		
		return theFortune;
	}
	
	@PostConstruct
	public void loadFortunesFromFile() throws IOException {

		try (BufferedReader br = new BufferedReader(new FileReader("C:\\Fortunes.txt"))) {
		    while (br.ready()) {
		    	fortuneList.add(br.readLine());
		    }
		}
	}

}
