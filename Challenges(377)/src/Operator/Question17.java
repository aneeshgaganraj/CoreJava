package Operator;

public class Question17 {
	    public static String reverse(String str) {
	        if (str.isEmpty()) {
	            return str;
	        } else {
	            return reverse(str.substring(1)) + str.charAt(0);
	        }
	    }

	    public static void main(String[] args) {
	        String original = "Hello, World!";
	        String reversed = reverse(original);
	        System.out.println("Original: " + original);
	        System.out.println("Reversed: " + reversed);
	    }
	

}
