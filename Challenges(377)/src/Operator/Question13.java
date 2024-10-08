package Operator;

import java.util.Scanner;

public class Question13 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the NUmbers: ");
		int num = scan.nextInt();
		int count = 0;
		for(int i = 1; i <= num; i++) {
			if(num % i == 0) {
				count++;
			}
		}
		if(count == 2) {
			System.out.println("Prime NUmber");
		}
		else {
			System.out.println("Not Prime NUmber");
		}
	}
}
