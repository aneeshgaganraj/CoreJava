package DataTypes;

public class Question9 {
	public static void main(String[] args) {
		String s1 =  "Aneesh";
		int count = 0;
		char ch[] = s1.toCharArray();
		for(char x : ch) {
			count++;
		}
		System.out.println("length is: " + count);
	}
}
