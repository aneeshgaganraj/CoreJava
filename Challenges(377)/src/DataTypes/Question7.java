package DataTypes;

public class Question7 {
	public static void main(String[] args) {
		int [] arr = {12,34,156,1,78};
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(int i : arr) {
			if( i > max) {
				max = i;
				
			}
			if(i < min) {
				min = i;
				
			}
		}
		System.out.println("Maximum element is : " + max);
		System.out.println("Minimum Element is: " + min);
	}
}
