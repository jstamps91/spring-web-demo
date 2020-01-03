package com.luv2code.springdemo;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {

		String arr[] = new String[3];

		arr[0] = "Today is your lucky day!";
		arr[1] = "You're going to have a tough day.";
		arr[2] = "You will learn something new about yourself today!";

		int size = 3;
		int rand = (int) (Math.random() * (size + 1));

		return arr[rand];
	}
}