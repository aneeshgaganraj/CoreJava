package Introduction;

public class Question2 {

	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1; i < 101; i++) {
			if(i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println("The Sum of Even Numbers is: " + sum);
	}
}
