package Introduction;

import java.util.Scanner;

public class Quetion8 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no of terms");
		int  n = scan.nextInt();
		int firstterm = 0;
		int secondterm = 1;
		System.out.println("Fibbonachi sieries upto: " +n + "is given");
		for(int i = 1; i < n +1 ; i++) {
			System.out.println(" " + firstterm);
			int nextterm = firstterm + secondterm;
			firstterm = secondterm;
			secondterm = nextterm;
		}
	}
}
