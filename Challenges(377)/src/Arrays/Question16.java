package Arrays;

import java.util.Arrays;

public class Question16 {
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5};
		int [] left = rotateleft(arr,2);
		System.out.println(Arrays.toString(left));
		System.out.println(Arrays.toString(rotateright(left,2)));
	}
	public static int[] rotateleft(int[] arr, int rotations) {
		int length = arr.length;
		rotations = rotations % length;
		int [] temp = new int[length];
		for(int i = 0; i < arr.length;i++) {
			temp[i] = arr[(i+rotations) % length];
		}
		return temp;
	}
	public static int[] rotateright(int[] arr, int rotations) {
		int length = arr.length;
		rotations = rotations % length;
		int [] temp = new int[length];
		for(int i = 0; i < length;i++) {
			temp[i] = arr[(i + length - rotations) % length];
		}
		return temp;
	}
}
