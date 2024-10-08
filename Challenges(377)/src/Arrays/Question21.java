package Arrays;

public class Question21 {
	public static void main(String[] args) {
		int[][] matrix = {
	            {1, 2, 3, 4},
	            {5, 6, 7, 8},
	            {9, 10, 11, 12},
	            {13, 14, 15, 16}
	        };
		for(int i = 0; i < matrix.length;i++) {
			int rowsum = 0;
			int colsum =0;
			for(int j = 0; j < matrix[0].length;j++) {
				rowsum += matrix[i][j];
				colsum += matrix[j][i];
			}
			System.out.println("Sum of row " + i + " is: " + rowsum);
			System.out.println("Sum of column " + i + " is: " + colsum);
		}
	}
}
