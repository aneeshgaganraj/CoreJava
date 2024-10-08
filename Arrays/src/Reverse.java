import java.util.Arrays;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,7,11,8,9};
		System.out.println(Arrays.toString(arr));
		int low =0;
		int high = arr.length-1;
		while(low <= high) {
			int temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;
			low++;
			high--;
		}
		System.out.println(Arrays.toString(arr));
	}

}
