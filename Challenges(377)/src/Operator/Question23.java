package Operator;

import java.util.Scanner;

public class Question23 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the NUmber: ");
		int number = scan.nextInt();
		for(int i = 1; i < 11; i++) {
			System.out.println(number + " X " + i + " = " + (number * i));
		}
	}
}
