import java.util.Scanner;

public class Twodimension {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = new int[2][2];
		Scanner scan =new Scanner(System.in);
		for(int i =0; i<arr.length;i++) {
			for (int j =0; j < arr[i].length; j++) {
				System.out.println("Enter the Marks of class: " + i  + " Student: " + j);
				arr[i][j] = scan.nextInt();
			}
		}
		for(int i = 0; i < arr.length; i ++) {
			for(int j =0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
		}
	}

}
