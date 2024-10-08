
public class BinarySearch {
	public static void main(String[] args) {
		int [] arr = {2,4,6,8,10,11};
		int key = 11;
		int satus = binarySearch(arr,key);
		if(satus == -1) {
			System.out.println("Key not found ");
		}
		else {
			System.out.println("key Found at index: " + satus);
		}
		//System.out.print(binarySearch(arr,12));
	}
	static int binarySearch(int [] arr, int key) {
		int low = 0;
		int high = arr.length-1;
		int mid;
		while(low <= high) {
			mid = (low + high)/2;
			if(key == arr[mid]) {
				return mid;
			}
			else if(key > arr[mid]) {
				low = mid + 1;
			}
			else {
				high = mid -1;
			}
		}
		return -1;
	}
}
