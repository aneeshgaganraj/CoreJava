package Operator;

import java.util.Scanner;

public class Question14 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = scan.nextInt();
		System.out.println("The Factorial is: " + factorial(num));
	}
	public static int factorial(int num){
		if(num == 0) {
			return 1;
		}
		return num * factorial(num-1);
	}
}
