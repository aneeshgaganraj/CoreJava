package Operator;

import java.util.Scanner;

public class Question25 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = scan.nextInt();
		int original = number;
		int sum = 0;
		int digit = 0;
		while(original != 0) {
			original /= 10;
			++digit;
		}
		original = number;
		while(original != 0) {
			int remainder = original % 10;
			sum += Math.pow(remainder, digit);
			original /= 10;
		}
		System.out.println(sum);
		if(sum == number) {
			System.out.println("Armstrong Number");
		}
		else {
			System.out.println("Not Armstromg Number");
		}
	}
}
