package Operator;

import java.util.Scanner;

public class Question8 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Values");
		int principal = scan.nextInt(); 
		int rate = scan.nextInt();
		int time = scan.nextInt();
		int times_compound = scan.nextInt();
		int rate_decimal = rate / 100;
	    int amount =  (int) (principal * Math.pow((1 + rate_decimal / times_compound), times_compound * time));
	    int interest = amount - principal;
	    System.out.println(interest);
	}
}
