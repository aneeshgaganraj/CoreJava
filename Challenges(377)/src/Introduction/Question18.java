package Introduction;

public class Question18 {
	public static void printpascalstriangle(int n) {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.println(binomialcoefficent(i,j) +  " ");
			}
			System.out.println();
		}
	}
	public static int binomialcoefficent(int n , int k) {
		int res = 1;
		if(k > n -k ) {
			k  = n- k;
		}
		for(int i = 0; i < k; i++) {
			res *= (n-i);
			res /= (i +1);
		}
		return res;
	}
	public static void main(String[] args) {
		int  n = 5;
		printpascalstriangle(n);
	}
}

