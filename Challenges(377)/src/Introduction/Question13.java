package Introduction;

import java.util.Scanner;

public class Question13 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Two Numbers");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int gcd = 0;
		for(int i = 1; i <= num1; i++) {
			if(num1 % i == 0 && num2 % i == 0) {
				//System.out.println(i);
				if( i > gcd) {
					gcd = i;
				}
			}
		}
		System.out.println((num1*num2)/gcd);
		System.out.println(gcd);
	}
}
