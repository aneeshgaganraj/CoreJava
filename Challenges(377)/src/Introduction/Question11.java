package Introduction;

import java.util.Scanner;

public class Question11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Value");
		String name = scan.nextLine();
		String reverse = "";
		for(int i = name.length()-1;i>=0;i--) {
			reverse  += name.charAt(i);
		}
		System.out.println(reverse);
		if(name.equals(reverse)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}
}
