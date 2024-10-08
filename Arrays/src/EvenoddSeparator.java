import java.util.Arrays;

public class EvenoddSeparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]  = {1,4,7,2};
		System.out.println(Arrays.toString(arr));
		int j = 0;
		int i =0;
		while(i< arr.length){
			if(arr[i] % 2 != 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
			}
			i++;
		}
		System.out.println(Arrays.toString(arr));
	}

}
