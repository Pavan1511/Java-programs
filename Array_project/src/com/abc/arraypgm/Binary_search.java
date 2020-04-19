//enter the elements in sorted order
package com.abc.arraypgm;

import java.util.Scanner;

public class Binary_search {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		boolean flag=false;
		System.out.println("enter the no of elements");
		int n=scan.nextInt();
		int a[]=new int[n];

		for(int i=0;i<=a.length-1;i++) {
			System.out.println("enter the elements");
			a[i]=scan.nextInt();
		}


		System.out.println("enter the elements to be searched ");
		int key=scan.nextInt();
		scan.close();

		int first=0;
		int last=n-1;
		int mid=0;
		while(first<=last) {
			mid=(first+last)/2;
			if(a[mid]==key) {
				System.out.println("element is found");
				System.out.println("position of the element"+(mid+1));
				flag=true;
				break;
			}

			else if(a[mid]<key) 
				first=mid+1;

			else 
				last=mid-1;



		}
		if(flag==false)
			System.out.println(" element is not found");

	}

}
