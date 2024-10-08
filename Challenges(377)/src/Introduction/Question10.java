package Introduction;

public class Question10 {
	public static void main(String[] args) {
		String name = "Aneesh";
		String reverse = " ";
		for(int i = name.length() - 1; i >=  0; i--) {
			reverse += name.charAt(i);
		}
		System.out.println(reverse);
	}
}
