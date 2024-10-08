package Operator;

import java.util.Scanner;

public class Question15 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the base number: ");
        int base = scanner.nextInt();
        System.out.println("Enter the exponent: ");
        int exponent = scanner.nextInt();
        
        // Calculate power using recursion
        int result = power(base, exponent);
        System.out.println(result);
	}
	public static int power(int number, int exponent) {
		if(exponent == 0) {
			return 1;
		}
		return number* power(number,exponent-1);
	}
}
