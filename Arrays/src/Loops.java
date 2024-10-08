
public class Loops{
	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50,60};
		System.out.println("Using For Loop");
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("Using While");
		int j = 0;
		while(j < arr.length) {
			System.out.println(arr[j]);
			j++;
		}
		System.out.println("Using do while");
		int k = 0;
		do {
			System.out.println(arr[k]);
			k++;
		}while(k < arr.length);
		System.out.println("Using for each");
		for(int x: arr) {
			System.out.println(x);
		}
		byte arr1[] = new byte[5];
		short arr2[] = new short[4];
		float arr3[] = new float[5];
		char arr7[] = new char[5];
		System.out.println(arr1.getClass());
		System.out.println(arr2.getClass());
		System.out.println(arr3.getClass());
		System.out.println(arr7.getClass());
	}
}
