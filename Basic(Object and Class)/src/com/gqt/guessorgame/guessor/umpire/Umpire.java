package com.gqt.guessorgame.guessor.umpire;

import com.gqt.guessorgame.guessor.Guessor;
import com.gqt.guessorgame.guessor.player.Player;

public class Umpire {
int noFromGuessor;
int noFromPlayer1;
int noFromPlayer2;
int noFromPlayer3;

public void collectfromSystem() {
	Guessor g = new Guessor();
	noFromGuessor = g.guessorNumber();

}
public void collectfromPlayer() {
	Player p1 = new Player();
	Player p2 = new Player();
	Player p3 = new Player();
	
	noFromPlayer1 = p1.guessorNumber();
	System.out.println("Guessed Number from player1 : " + noFromPlayer1);
	noFromPlayer2 = p2.guessorNumber();
	System.out.println("Guessed Number from player2 : " + noFromPlayer2);
	noFromPlayer3 = p3.guessorNumber();
	System.out.println("Guessed Number from player3 : " + noFromPlayer3);
}
public void compare() {
	if(noFromGuessor == noFromPlayer1) {
		System.out.println("Player1 is the Winner");
	}
	if(noFromGuessor == noFromPlayer2) {
		System.out.println("Player2 is the Winner");
	}
	if(noFromGuessor == noFromPlayer3) {
		System.out.println("Player3 is the Winner");
	}
	if(noFromGuessor != noFromPlayer3 && noFromGuessor != noFromPlayer2 && noFromGuessor != noFromPlayer1) {
	System.out.println("None of them have won");	
	}
}
}
