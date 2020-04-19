//linear search array
package com.abc.arraypgm;

import java.util.Scanner;

public class Launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); //to activate the the input option 
		boolean flag = false; 
		/*this boolean is use to verify the whether searching loop if no last if statement will execute as default is false */
		
		// enter the size of the array
		System.out.println("enter the no of elements");
		int n = scan.nextInt();  //unlocks the keyboard to taking the input for local variable n from user
		// declare the array
		int a[] = new int[n];//copy of n in a new array from users 
		// input to the array
		for (int i = 0; i <= a.length - 1; i++) {
			System.out.println("enter the element");
			a[i] = scan.nextInt();
		}
		// key element
		System.out.println("enter the element to be searched");
		int key=scan.nextInt();
		//close the object
		scan.close();       //end of user session for taking input  and hence need to close the scan object
		//searching 
		for(int i=0;i<=a.length-1;i++) {
			if(key==a[i]) {
				System.out.println("element is found");
				System.out.println("position of the element is:"+(i+1));
				flag=true;
				break;
			}
		}
		//check
		if(flag==false) {
			System.out.println("element not found");
		}
	}
}


