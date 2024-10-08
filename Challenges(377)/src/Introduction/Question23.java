package Introduction;

import java.util.Scanner;

public class Question23 {
	public static boolean isperfect(int num) {
		int sum = 0;
		for(int i  = 1; i <= num/2; i++) {
			if(num % i == 0) {
				sum += i;
			}
		}
		return sum == num;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scan.nextInt();
		System.out.println(isperfect(num));
	}
}
