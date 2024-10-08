package Introduction;

import java.util.Scanner;

public class Question14 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scan.nextInt();
		String binary =  " ";
		while(num > 0 ) {
			int rem = num % 2;
			binary += rem;
			num = num/2;
		}
		System.out.println(binary);
	}
}
