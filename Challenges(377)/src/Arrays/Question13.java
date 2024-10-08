package Arrays;
public class Question13 {
	public static void main(String[] args) {
		int array[] = {1,2,3,4,5};
		int product = 1;
		for(int i : array) {
			product *= i;
		}
		System.out.println("Product of all elements is: " + product);
	}
}
