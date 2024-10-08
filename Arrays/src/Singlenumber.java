
public class Singlenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {4,2,2,11,4,8,8,11,99};
		Single(nums);

	}
	static void Single(int [] nums){
		int a = 0;
		for(int x: nums) {
			a ^= x;
		}
		System.out.println(a);
	}
}
