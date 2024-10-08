import java.util.Arrays;

public class FirstandLast {
	public static void main(String[] args) {
		int [] arr = {13,4,7,8,9,11,11,11,12,13,13,11};
		int target = 13;

		System.out.println(Arrays.toString(FirstAndLast( arr,  target)));
		
	}
	static int[] FirstAndLast(int [] arr, int target) {
		int res[] = new int[2];
		res[0] = -1;
		res[1] = -1;
		for(int i = 0; i < arr.length; i++) {

				if(arr[i] == target && res[0] == -1) {
					res[0] = i;
				}
				if(arr[i] == target && res[0] != -1) {
					res[1] = i;
				}
				}
		return res;
	}
}
