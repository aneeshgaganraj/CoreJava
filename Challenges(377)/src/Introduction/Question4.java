package Introduction;

import java.util.Scanner;

public class Question4 {
	public static void main(String[] args) {
		System.out.println("Enter the Number You Want");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int count = 0;
		if(num > 1) {
			for(int i = 1; i < num + 1; i++) {
				if( num % i == 0) {
					count++;
				}
			}
			if(count == 2) {
				System.out.println("The Number: " + num  + " IS a Prime Number");
			}
			else {
				System.out.println("The Given Number is Not a Prime NUmber");
			}
		}
		else {
			System.out.println("Please Enter the Numbers More than 1");
		}
	}
}
