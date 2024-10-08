import java.util.Arrays;

public class Question2 {
	public static void main(String[] args) {
		int arr[] = {12,1,3,9,0};
		for(int i = 0; i < arr.length-1;i++) {
			int smallest = i;
			for(int j = i+1;j<arr.length;j++) {
				if(arr[smallest] > arr[j]) {
					int temp = arr[smallest];
					arr[smallest] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
