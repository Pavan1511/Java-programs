package arrays_and_jagged;
import java.util.Scanner;

public class One_Dimension_Array {
		
		public static void main(String[] args) {
		    Scanner scan=new Scanner(System.in);
		    int a[]=new int[5];
		    for(int i=0;i<=a.length-1;i++) {
		    	System.out.println("Enter the marks");
		    	a[i]=scan.nextInt();
		    }
		    System.out.println("marks are:");
		    for(int i=0;i<=a.length-1;i++) {
		    	System.out.println(a[i]);
		    }
		}
	}


