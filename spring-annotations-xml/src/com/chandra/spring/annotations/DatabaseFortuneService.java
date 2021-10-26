package com.chandra.spring.annotations;

import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "This is from Database Fortune Service - All the Best!";
	}

}
