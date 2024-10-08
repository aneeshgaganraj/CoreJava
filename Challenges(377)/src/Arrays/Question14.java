package Arrays;

import java.util.Arrays;

public class Question14 {
	public static void main(String[] args) {
		int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        int [] arr = {12,35,1,10,34,1};
        Arrays.sort(arr);
        int secondsmallest = arr[0];
        for(int i = 1; i < arr.length; i++) {
        	if(arr[i] > secondsmallest) {
        		secondsmallest = arr[i];
        		break;
        	}
        }
        int secondlargest = arr[arr.length-1];
        for(int i = arr.length - 2; i >= 0; i--) {
        	if(arr[i] < secondlargest) {
        		secondlargest = arr[i];
        		break;	
        	}
        }
        System.out.println(secondsmallest);
        System.out.println(secondlargest);
	}
}
