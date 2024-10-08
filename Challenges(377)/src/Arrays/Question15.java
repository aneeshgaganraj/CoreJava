package Arrays;

public class Question15 {
	public static void main(String[] args) {
		int [] arr = {12,34,56,7,99};
		System.out.println(indexvalue(arr,99));
	}
	public static int indexvalue(int [] arr, int element) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == element) {
				return i;
			}
		}
		return -1;
	}
}
