package A_ZPatters;

import java.util.Scanner;

public class B_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enterr the number");
		int n=scan.nextInt();
		scan.close();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0 && j<n/2 ||i==n/2 && j<n/2 ||i==n-1 && j<n/2 ||j==n/2 && i!=0 && i!=n/2 && i!=n-1||j==0) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
