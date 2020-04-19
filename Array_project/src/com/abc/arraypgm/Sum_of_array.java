package com.abc.arraypgm;

import java.util.Scanner;

public class Sum_of_array {


	public static void main(String agrs[]) {
		//this is manual way of inputing the data
		/*	int bucky[]= {1,4,3,9}; //array initializer
		int sum=0;
		for(int counter=0;counter<bucky.length;counter++) {
			sum+=bucky[counter];
		}
		System.out.println("the sum of these num is "+" "+sum); */

		//user based input
		Scanner scan=new Scanner(System.in);
		System.out.print("enter the number of arrays");
		int n=scan.nextInt(); //1,2,3,4,5
		int a[]=new int[n];   //a[]={1,2,3,4,5}

		for(int i=0,sum=0;i<a.length;i++){
			System.out.println("enter the arrays");
			a[i]=scan.nextInt();
			sum=sum+a[i];
			System.out.println("sum is  :"+sum);
			//System.out.print(a[i]); 
		}
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");

		}
		scan.close();  

	}
}    




