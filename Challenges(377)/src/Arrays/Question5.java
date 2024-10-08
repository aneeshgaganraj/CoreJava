package Arrays;
import java.util.Arrays;
public class Question5 {
	public static void main(String[] args) {
		int arr[] =  {12,34,2,5,6};
		int start = 0;
		int end = arr.length -1;
		while(start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;	
		}
		System.out.println(Arrays.toString(arr));
	}
}
