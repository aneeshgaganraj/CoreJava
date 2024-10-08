import java.util.Arrays;

public class Question3 {
	public static void main(String[] args) {
		int arr[] = {12,1,3,9,0,11};
		for(int i = 1; i < arr.length;i++) {
			int j = i -1;
			int current = arr[i];
			while(j>= 0 && arr[j] > current) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = current;
		}
		System.out.println(Arrays.toString(arr));
	}
}
