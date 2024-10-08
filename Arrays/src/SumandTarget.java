import java.util.Arrays;

public class SumandTarget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {2,4,6,8,11,15};
		System.out.print(Arrays.toString(Twosum(arr,15)));

	}
	static int[] Twosum(int[] arr, int target) {
		int res[] = new int[2];
		for(int i= 0; i <arr.length; i++) {
			for(int j = arr.length -1; j > 0; j--) {
				if(arr[i] + arr[j] == target) {
					res[0] = i;
					res[1] = j;
					return res;
				}
			}
		}
		return res;
	}
}
