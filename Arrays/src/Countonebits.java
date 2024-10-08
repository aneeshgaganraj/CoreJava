import java.util.Arrays;

public class Countonebits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {0,1,6,8,4,15,5,3,7,2};
		System.out.println(Arrays.toString(arr));
		for(int i =0 ; i < arr.length-1;i++) {
			for(int j = 0; j < arr.length - 1 - i; j++) {
				if(countbits(arr[j]) > countbits(arr[j + 1])) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
		
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(countbits(7));
	}
	static int countbits(int n) {
		int count = 0;
		while(n != 0) {
			if (n % 2 == 1) {
				count++;
			}
			n = n/2;
		}
		return count;
	}
}
