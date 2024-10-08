package com.gqt.solutions;

import java.util.Arrays;

public class MergeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] p = {1,2,3,4,5,6};
		int [] q = {7,8,9,10};
		int [] r = new int[10];
		for(int i = 0; i < p.length;i++) {
			r[i] = p[i];
		}
		for(int j =0; j < q.length;j++) {
			r[j+6] = q[j];
		}
		System.out.println(Arrays.toString(r));
		
		System.arraycopy(p, 0, r, 0, p.length);
		System.arraycopy(q, 0, r, p.length, q.length);
		System.out.println(Arrays.toString(r));
	}

}
