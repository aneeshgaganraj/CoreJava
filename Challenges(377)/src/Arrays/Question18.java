package Arrays;

public class Question18 {
	public static void main(String[] args) {
		int [] arr1 = {1,2,3,4,5,6};
		int [] arr2 = {1,2,3,4,53,6,3};
		for(int i = 0 ; i < arr2.length;i++) {
			if(arr1.length != arr2.length) {
				System.out.println("Not Equal");
				System.exit(0);
			}
			if(arr1[i] != arr2[i]) {
				System.out.println("Not Equal");
				System.exit(0);
			}
		}
		System.out.println("Equal");
	}
}
