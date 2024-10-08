package DataTypes;

import java.util.Scanner;

public class Question15 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String please");
		String s1 = scan.next();
		if(palindromecheck(s1)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}
	static boolean palindromecheck(String s) {
		int start = 0;
		int end = s.length() - 1;
		while(start < end) {
			if(s.charAt(start) != s.charAt(end)) {
				return false;
			}
			start++;
			end--;
	}
		return true;
}
}
