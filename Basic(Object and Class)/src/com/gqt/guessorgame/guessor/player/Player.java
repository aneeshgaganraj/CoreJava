package com.gqt.guessorgame.guessor.player;

import java.util.Scanner;

public class Player {
int playerNumber;
public int guessorNumber() {
	System.out.println("Do Guess A NUmber Players");
	Scanner r = new Scanner(System.in);
	playerNumber = r.nextInt();
	
	return playerNumber;
}
}
