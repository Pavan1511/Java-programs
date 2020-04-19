package com.abc.arraypgm;

public class Min_of_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {20,21,24,25,26}; //array initializer
		int min=a[0];
		for(int i=0;i<=a.length-1;i++) {
			if(a[i]<min) {
				min=a[i];

			}
			//System.out.println("max is "+" "+max);
		}
		System.out.println("min is "+" "+min);
	}

}
