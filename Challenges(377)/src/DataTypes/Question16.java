package DataTypes;

public class Question16 {
	public static void main(String[] args) {
		String s1 = "aneesh";
		String reverse = "";
		int length = length(s1);
		for(int i = length -1; i >= 0; i--) {
			reverse += s1.charAt(i);
		}
		System.out.println(reverse);
		System.out.println(length(s1));
	}
	static int length(String s1) {
		char ch[] = s1.toCharArray();
		int count = 0;
		for(char x : ch) {
			count++;
		}
		return count;
	}
}
