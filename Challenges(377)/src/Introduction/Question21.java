package Introduction;

import java.util.Scanner;

public class Question21 {
	public static void Printtables(int num) {
		for(int i =1; i <=20; i++) {
			System.out.println(num + " * " + i + " = " + num * i);
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the table u want");
		int num = scan.nextInt();
		Printtables(num);
	}
}
