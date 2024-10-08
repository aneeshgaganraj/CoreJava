package Arrays;

import java.util.ArrayList;

public class Question9 {
	public static void main(String[] args) {
		 int[] array1 = {1, 2, 3, 4, 5,9};
	     int[] array2 = {4, 5, 6, 7, 8,9};
	     ArrayList<Integer> intersection = new ArrayList<>();
	     for(int i =0; i < array1.length; i++) {
	    	 for(int j =0 ; j < array2.length;j++) {
	    		 if(array1[i] == array2[j]) {
	    			 if(!intersection.contains(array1[i])) {
	    				 intersection.add(array1[i]);
	    			 }
	    			 break;
	    		 }
	    	 }
	     }
	     System.out.print("Intersection: ");
	        for (int i = 0; i < intersection.size(); i++) {
	            System.out.print(intersection.get(i) + " ");
	        }
	}
}
