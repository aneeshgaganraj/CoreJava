package Operator;

import java.util.Scanner;

public class Question2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the numbers");
		int num = scan.nextInt();
		int num1 = scan.nextInt();
		if(num > 2 & num > 5) {
			System.out.println(num + " " + num1);
		}
		else if(num > 3 || num1 > 3) {
			System.out.println("Or");
		}
		else {
			System.out.println("None");
		}
		int a = 10;
		int res = a ^ 20;
		System.out.println(res);
	}

}
