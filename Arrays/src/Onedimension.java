import java.util.Scanner;

public class Onedimension {
	public static void main(String[] args) {
		int [] arr = new int[5];
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i < arr.length; i++) {
			System.out.println("Enter the Marks : ");
			arr[i] = scan.nextInt();
		}
		for(int i =0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
