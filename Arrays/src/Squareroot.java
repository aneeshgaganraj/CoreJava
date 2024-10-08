
public class Squareroot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		squareroot(12);
	}
	static void squareroot(int x) {
		int low = 1;
		int high = x;
		int mid = 0;
		while(low <= high) {
			 mid = (low + high)/2;
			if(mid * mid == x) {
				System.out.println(mid);
				System.exit(0);
			}
			else if(mid * mid > x) {
				high  = mid - 1;
			}
			else {
				low = mid + 1;
			}
		}
		System.out.println(mid);
	}
}
