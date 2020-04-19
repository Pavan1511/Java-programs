package com.abc.arraypgm;
import java.util.Scanner;
public class Demo22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("enter the number of arrays");
		int n=scan.nextInt(); //1,2,3,4,5
		int a[]=new int[n];   //a[]={1,2,3,4,5}
		for(int i=0;i<a.length;i++){
		a[i]=scan.nextInt();
		//System.out.print(a[i]);
	}
		for(int i=0;i<a.length;i++){
		System.out.print(a[i]+" ");
	}
	}
}
