package Operator;

import java.util.Scanner;

public class Question7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = scan.nextInt();
		if(num % 5 == 0 & num % 7 == 0) {
			System.out.println("Divisible");
		}
		else {
			System.out.println("Not Divisible");
		}
	}
}
