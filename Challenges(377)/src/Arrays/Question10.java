package Arrays;

public class Question10 {
	public static void main(String[] args) {
		int array [] = {1,2,3,2,1,0};
		boolean status = Pallindrome(array);
		if(status) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}
	public static boolean Pallindrome(int [] array) {
		int start =0;
		int end =  array.length - 1;
		while(start < end) {
			if(array[start] != array[end]) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
}
