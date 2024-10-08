package Arrays;

public class Question23 {
	public static void main(String[] args) {
		 int[][] matrix = {
		            {1,2,3},
		            {4,5,6},
		            {7,8,9}
		        };
		 findSaddlePoint(matrix);
	 }
	public static void findSaddlePoint(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean saddlePointFound = false;

        for (int i = 0; i < rows; i++) {
            // Find the minimum element in the current row
            int minRow = matrix[i][0];
            int colIndex = 0;

            for (int j = 1; j < cols; j++) {
                if (matrix[i][j] < minRow) {
                    minRow = matrix[i][j];
                    colIndex = j;
                }	
            }

            // Check if this minimum element is the largest in its column
            boolean isSaddlePoint = true;
            for (int k = 0; k < rows; k++) {
                if (matrix[k][colIndex] > minRow) {
                    isSaddlePoint = false;
                    break;
                }
            }

            if (isSaddlePoint) {
                System.out.println("Saddle point found at: (" + i + ", " + colIndex + ") with value: " + minRow);
                saddlePointFound = true;
            }
        }

        if (!saddlePointFound) {
            System.out.println("No saddle point found in the matrix.");
        }
    }
	}

