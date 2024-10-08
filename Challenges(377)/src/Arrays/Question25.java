package Arrays;

public class Question25 {
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,-5,-6,0,-9,0};
		int negative = 0, positive = 0 , neutral = 0;
		for(int i : arr) {
			if(i < 0) {
				negative++;
			}
			else if(i > 0) {
				positive++;
			}
			else {
				neutral++;
			}
		}
		System.out.println("negative values is :" + negative);
		System.out.println("positive values is :" +positive);
		System.out.println("neutral values is :" +neutral);
	}
}
