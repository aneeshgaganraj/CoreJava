package com.gqt.guessorgame.guessor;

import java.util.Random;

public class Guessor {
	int guessorNumber;
	public int guessorNumber() {
		System.out.println("System Has Guessed a Number");
		Random r = new Random();
		guessorNumber = r.nextInt(1,2);
		System.out.println("Guessed Number from System : " + guessorNumber);
		return guessorNumber;
		
	}
}
