package Introduction;

import java.util.Scanner;

public class Question16 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Year: ");
		int y = scan.nextInt();
		if(y%100 == 0 && y%400==0 || y%100 !=0 && y%4 == 0) {
			System.out.println("Leap Year");
		}
		else {
			System.out.println("Not a Leap year");
		}
	}
}
