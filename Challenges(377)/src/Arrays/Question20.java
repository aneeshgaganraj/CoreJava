package Arrays;

public class Question20 {
	public static void main(String[] args) {
		int[][] matrix = {
	            {1, 2, 3, 4},
	            {5, 6, 7, 8},
	            {9, 10, 11, 12},
	            {13, 14, 15, 16}
	        };
		int sum = 0;
			for(int j  = 0; j <= matrix[3].length - 1;j++) {
				sum += matrix[3][j];
			}
		System.out.println(sum);
	}
	}

