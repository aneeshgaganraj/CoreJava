package Introduction;

public class Question9 {
	public static void main(String[] args) {
		int [] arr = {55,2,8,6,77};
		int firstmax = 0;
		int secondmax = Integer.MIN_VALUE;
		for(int value : arr) {
			if(value > firstmax) {
				secondmax = firstmax;
				firstmax = value;
			}
			else if(value > secondmax && value != firstmax) {
				secondmax = value;
			}
		}
		System.out.println("Second Maximum Value in the Array is: " + secondmax);
	}
}
