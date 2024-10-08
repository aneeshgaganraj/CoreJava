package com.gqt.guessorgame.guessor.Main;

import com.gqt.guessorgame.guessor.umpire.Umpire;

public class Main {
	public static void main(String[] args) {
		Umpire u = new Umpire();
		u.collectfromSystem();
		u.collectfromPlayer();
		u.compare();
	}
}
