import java.util.Scanner;

public class TwodimensionalJacked {

	public static void main(String[] args) {
		int arr[][] = new int[2][];
		arr[0] = new int[3];
		arr[1] = new int[4];
		//Storing Values
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				Scanner scan = new Scanner(System.in);
				System.out.println("Enter the value of class: " + i + "Student " + j);

				arr[i][j] = scan.nextInt();
			}
		}
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
		}
	}
}
