import java.util.Arrays;

public class Bublesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {50,30,1,20,40,10,2};
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(Bublesort(arr)));
	}
	static int[]  Bublesort(int [] arr) {
		for(int i =0 ; i < arr.length-1;i++) {
			for(int j = 0; j < arr.length - 1 - i; j++) {
				if(arr[j+1] < arr[j]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
		
			}
		}
		return arr;
	}

}
