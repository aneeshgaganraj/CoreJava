package Operator;

import java.util.Scanner;

public class Question6 {
	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		float farhenite = Scan.nextFloat();
		float celcius = (farhenite - 32) * 5 / 9;
		System.out.println(celcius);
		
	}
}
