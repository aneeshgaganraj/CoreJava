import java.util.Scanner;

public class Penagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the  String");
		String s2 = scan.next();
		System.out.println(penagram(s2));
	}
	static String penagram(String s1) {
		s1 = s1.replace(" ", "");
		s1 = s1.toLowerCase();
		int x[] = new int[26];
		for(int i=0; i < s1.length();i++) {
			x[s1.charAt(i)-'a']++;
		}
		for(int i =0; i<x.length;i++) {
			if(x[i] == 0) {
				return "Not Penagram";
			}
		}
		return "Penagram";
	}
}
