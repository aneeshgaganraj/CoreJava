package Operator;

import java.util.Scanner;

public class Question16 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of terms for Fibonacci series: ");
        int numTerms = scanner.nextInt();
        System.out.println("Fibonacci series:");
        for (int i = 0; i < numTerms; i++) {
            System.out.print(fibonacci(i) + " ");
        }
	}
	public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

}
