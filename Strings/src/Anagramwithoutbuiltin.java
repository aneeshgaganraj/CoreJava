import java.util.Scanner;

public class Anagramwithoutbuiltin {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first String");
		String s1 = scan.next();
		System.out.println("Enter the first String");
		String s2 = scan.next();
		System.out.println(anagram(s1,s2));
	}
	static String anagram(String s1, String s2) {
		if(lengths(s1)!= lengths(s2)) {
			return "Not Anagram";
		}
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		int x[] =  new int[26];
		int y[] = new int[26];
		for(int i = 0; i<lengths(s1);i++) {
			x[s1.charAt(i) - 'a']++;
		}
		for(int i = 0; i < lengths(s2);i++) {
			y[s2.charAt(i) - 'a']++;
		}
		for(int i=0; i < x.length;i++) {
			if(x[i] != y[i]) {
				return "Not Anagram";
			}
		}
		return "Anagram";
	}
	static int lengths(String s1) {
		int count = 0;
		char ch[] = s1.toCharArray();
		for(char x: ch) {
			count++;
		}
		return count;
	}
}
