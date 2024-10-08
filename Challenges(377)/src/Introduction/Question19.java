package Introduction;

import java.util.Scanner;

public class Question19 {
	public static boolean isArmstrong(int num) {
		int original= num;
		int sum = 0;
		int n = String.valueOf(num).length();
		while(num != 0 ) {
			int digit = num % 10;
			sum += Math.pow(digit, n);
			num /= 10;
		}
		return sum == original;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = scan.nextInt();
		
		System.out.println(isArmstrong(num));
	}
}
