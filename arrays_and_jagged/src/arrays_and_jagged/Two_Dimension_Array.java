package arrays_and_jagged;

import java.util.Scanner;

public class Two_Dimension_Array {
	
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);
	    //classes
	    int a[][]=new int[3][];
	    //students
	  a[0]=new int[3];
	    a[1]=new int[4];
	    a[2]=new int[2];  
	    for(int i=0;i<=a.length-1;i++) {
	    	 for(int j=0;j<=a[i].length-1;j++) {
	    		 
	    	System.out.println("Enter the marks of class"+ i +"students"+j );
	    	a[i][j]=scan.nextInt();
	    }
	    }
	    System.out.println("marks are:");
	    for(int i=0;i<=a.length-1;i++) {
	    	for(int j=0;j<=a[i].length-1;j++) {
	    	System.out.println(a[i][j]);
	    }
	    }
	}
}
