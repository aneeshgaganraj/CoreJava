import java.util.Arrays;

public class Multiply {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {4,2,1,7};
		System.out.println(Arrays.toString(multiplyanddivide(arr)));

	}
	static int[] multiplyanddivide(int [] arr) {
		int [] main = new int[arr.length];
		int prod = 1;
		for(int i = 0; i < arr.length; i++) {
			prod = arr[i] * prod;
		}
		for(int i =0; i < main.length; i++) {
			 main[i] = prod/arr[i];
		}
		return main;
	}
}
