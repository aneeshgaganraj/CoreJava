import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first String");
		String s1 = scan.next();
		System.out.println("Enter the first String");
		String s2 = scan.next();
		System.out.println(anagram(s1,s2));
	}
	static String anagram(String s1, String s2) {
		if(s1.length()!=s2.length()) {
			return "Not Anagram";
		}
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		char str1[] = s1.toCharArray();
		char str[] = s2.toCharArray();
		Arrays.sort(str1);
		Arrays.sort(str);
		for(int i = 0; i < str1.length;i++) {
			if(str1[i] != str[i]) {
				return "Not Anagram";
			}
		}
		return "Anagram";
	}
}
