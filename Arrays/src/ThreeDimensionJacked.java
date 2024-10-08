import java.util.Scanner;

public class ThreeDimensionJacked {
	public static void main(String[] args) {
		int arr[][][] = new int[3][][];
		arr[0] = new int[3][3];
		arr[1] = new int[2][3];
		arr[2] = new int[3][3];
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				for(int k = 0; k < arr[i][j].length; k++) {
					System.out.println("Enter the Values of School " + i + " Class " + j + " Student " + k);
					arr[i][j][k] = scan.nextInt();
				}
			}
		}
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				for(int k = 0; k < arr[i][j].length; k++) {
					System.out.println(arr[i][j][k]);
				}
			}
		}
	}
}
