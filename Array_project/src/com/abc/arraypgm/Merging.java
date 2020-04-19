package com.abc.arraypgm;

import java.util.Scanner;

public class Merging {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter the first array elements size");
		int m=scan.nextInt();
		System.out.println("enter the second array elements size");
		int n=scan.nextInt();
		
		int a[]=new int[m];
		int b[]=new int[n];
		System.out.println("enter the elements of 1st array ");
		for(int i=0;i<=m-1;i++) {
			a[i]=scan.nextInt();
		}
		System.out.println("enter the elements of 2st array ");
		for(int i=0;i<=n-1;i++) {
			b[i]=scan.nextInt();
		}
		scan.close();
		int  c[] =new  int[m+n]; //size of m and n that is size of 1st array and 2nd array
		
		for(int i=0;i<=m-1;i++) {
			c[i]=a[i];
		}
		for(int i=0,k=m;i<=n-1;i++,k++) {
			c[k]=b[i];
		}
		System.out.println(" the elements of 3st array ");
		for(int i=0;i<=(m+n)-1;i++) {
			System.out.println(c[i]+" ");
		}
	}

}
