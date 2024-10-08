
public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,7,8,3,4,6};
		System.out.println(linearSearch(arr,6));
	}
	static int linearSearch(int [] arr, int key) {
		for(int i = 0; i< arr.length;i++) {
			if(arr[i] == key) {
				return i;
			}
		}
		return -1;
	}
}
