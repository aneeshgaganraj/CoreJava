import java.util.Arrays;

public class Addingone {
	public static void main(String[] args) {
		int arr[] = {9,9,9};
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(pluseone(arr)));
		
	}
	static int[] pluseone(int[] arr) {
		int i = arr.length-1;
		while( i >= 0) {
			if(arr[i] != 9) {
				arr[i] += 1;
				return arr;
			}
			else {
				
				arr[i] = 0;
			}
			i--;
		}
		int res[] = new int[arr.length + 1];
		res[0] = 1;
		return res;
	}
}
