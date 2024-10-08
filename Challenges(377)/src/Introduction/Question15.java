package Introduction;

import java.util.Scanner;

public class Question15 {
	public static void main(String[] args) {
		int sum = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = scan.nextInt();
		while(num != 0) {
			sum += num % 10;
			num /= 10;
		}
		System.out.println(sum);
	}
}
