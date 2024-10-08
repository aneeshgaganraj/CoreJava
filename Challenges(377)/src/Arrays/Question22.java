package Arrays;

public class Question22 {
	public static void main(String[] args) {
		int[][] matrix = {
	            {1, 2, 3},
	            {2,4,5},
	            {3,5,6}
	        };
		boolean status = issymmetric1(matrix);
		if(status == true) {
			System.out.println("Symmetric Matrix");
		}
		else {
			System.out.println("Asymmetric Matrix");
		}
	}
	public static boolean issymmetric1(int [][] matrix) {
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[0].length; j++) {
				if(matrix[i][j] == matrix[j][i]) {
					return true;
				}
			
			}
			return false;
		}
		return false;
	
	}

	
}
