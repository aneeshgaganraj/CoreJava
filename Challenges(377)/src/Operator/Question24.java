package Operator;

import java.util.Scanner;

public class Question24 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Principle");
		int principle = scan.nextInt();
		System.out.println("Enter the Rate");
		int rate = scan.nextInt();
		System.out.println("Enter the Time");
		int time = scan.nextInt();
		double interest = (principle * time * rate)/ 100;
		System.out.println(interest);
	}
}
