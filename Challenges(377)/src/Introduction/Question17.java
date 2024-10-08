package Introduction;

import java.util.Scanner;

public class Question17 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scan.nextInt();
		int sum = 1;
		for(int i = 1; i <= num ;i++) {
			sum *= i;
		}
		System.out.println(sum);
	}
}


	
