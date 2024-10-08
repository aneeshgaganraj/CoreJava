package Introduction;

import java.util.Scanner;

public class Question26 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Two Numbers");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		System.out.println(findhcf(num1,num2));
	}
	static int findhcf(int a, int b) {
		while(b != 0) {
			int temp = b;
			b = a%b;
			a = temp;
		}
		return a;
	}
}
