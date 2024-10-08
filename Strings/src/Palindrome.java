import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Value You Want to Enter");
		String value = scan.next();
		System.out.println(Palindrome(value));
	}
	static String Palindrome(String s1) {
		String reverse = "";
		for(int i = s1.length()-1;i>=0;i--) {
			reverse += s1.charAt(i);
		}
		if(s1.equals(reverse)) {
			return "Palindrome";
		}
		return "Not Palindrome";
	}
}
