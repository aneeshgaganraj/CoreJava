package Arrays;

public class Question1 {
	public static void main(String[] args) {
		int arr[] = {12,34,56,78};
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println(sum);
	}
}
