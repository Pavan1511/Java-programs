package Number_patterns;

import java.util.Scanner;

public class no_pattern_07 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=scan.nextInt();
		scan.close();
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i%2!=0)
					System.out.print(0);
				else
					System.out.print(1);
			}
				System.out.println();
			}
		/*	output:Enter the number
					4
					1111
					0000
					1111
					0000   */
	
	}
}
