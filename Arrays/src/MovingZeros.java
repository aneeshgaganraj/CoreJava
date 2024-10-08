import java.util.Arrays;

public class MovingZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {0,0,2,3,6,0,4};
		System.out.println(Arrays.toString(arr));
		int j = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != 0) {
				int temp = arr[i];
				arr[j] = arr[i];
				j++;
			}
		}
	
		for(int i =j; i < arr.length; i++) {
			arr[i] = 0;}
		System.out.println(Arrays.toString(arr));
}
}