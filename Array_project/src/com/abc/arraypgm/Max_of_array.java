package com.abc.arraypgm;

public class Max_of_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {20,21,24,25,26}; //array initializer
		int max=a[0];
		for(int i=0;i<=a.length-1;i++) {
			if(a[i]>max) {
				max=a[i];

			}
			//System.out.println("max is "+" "+max);
		}
		System.out.println("max is "+" "+max);
	}

}
