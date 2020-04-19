package com.abc.triangle;
import java.util.Scanner;
public class try2 {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the num");
			int n=sc.nextInt();
			
			for(int i=1;i<n;i++) {
				for(int k=1;k<=3;k++) {
					
				
				for(int j=0;j<n;j++) {
					if(i==n||(k==1||k==2*i-1)) {
						System.out.print("*");
					}
					else {
						System.out.print("_");
					}
				}
				}
				System.out.println();
			}
		}

	}
