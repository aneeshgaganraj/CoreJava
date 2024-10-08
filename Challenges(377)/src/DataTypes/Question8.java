package DataTypes;

public class Question8 {
	public static void main(String[] args) {
		int [] arr = {12,34,156,1,78};
		int sum = 0;
		int numberofarrayelements = arr.length;
		int avg = 0;
		for(int i : arr) {
			sum += i;
		}
		avg = sum/numberofarrayelements;
		System.out.println("Average is : " + avg);
	}
}
