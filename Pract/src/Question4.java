import java.util.Arrays;

public class Question4 {
	public static void main(String[] args) {
		int arr[] = {12,1,3,9,0,11};
		mergeSort(arr,0,arr.length-1);
	}
	public static void mergeSort(int array[], int left, int right) {
	    if (left < right) {

	      // m is the point where the array is divided into two sub arrays
	      int mid = (left + right) / 2;

	      // recursive call to each sub arrays
	      mergeSort(array, left, mid);
	      mergeSort(array, mid + 1, right);

	      // Merge the sorted sub arrays
	      Conqueror(array, left, mid, right);
	    }
	  }

	public static void Conqueror(int[] arr, int si,int mid, int ei) {
		int merge[] = new int[arr.length];
		int idx1 = si;
		int idx2 = mid + 1;
		int x = 0;
		while(idx1 <= mid && idx2 <= ei) {
			if(arr[idx1] <= arr[idx2]) {
				merge[x++] = arr[idx1++];
			}else {
				merge[x++] = arr[idx2++];
			}
		}
		while(idx1 <= mid) {
			merge[x++] = arr[idx1++];
		}
		while(idx2 <= ei) {
			merge[x++] = arr[idx2++];
		}
		for(int i = 0,j = si;i < merge.length;i++,j++) {
			arr[j] = merge[1];
		}
		System.out.println(Arrays.toString(arr));
	}
}
