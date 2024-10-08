package Operator;

import java.util.Scanner;

public class Question20 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Two Numbers");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		System.out.println(gcd(num1,num2));
		System.out.println(LCM(num1, num2));
	}
	public static int gcd(int a, int b) {
		int gcd = 0;
		if ( a < b) {
			for(int i = 1; i <= a; i++) {
				if(a % i == 0 && b % i == 0) {
					//System.out.println(i);
					if( i > gcd) {
						gcd = i;
					}
			}
		}
		}
		else {
			for(int i = 1; i <= b; i++) {
				if(a % i == 0 && b % i == 0) {
					//System.out.println(i);
					if( i > gcd) {
						gcd = i;
					}
			}
		}
		}
		return gcd;
}
	public static int LCM(int a, int b) {
		return ( a * b) / gcd(a,b);
	}
}
