package Introduction;

public class Question3 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println("Values Before Swapping the variables are: ");
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		 a = a ^ b;
		 b = a ^ b;
		 a = a ^ b;
		 System.out.println("After Swap the values are: " );
		 System.out.println("a: " + a);
		 System.out.println("b: " + b);
	}
}
