package Number_patterns;

import java.util.Scanner;

public class no_pattern_08 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner scan=new Scanner(System.in);
			System.out.println("enterr the number");
			int n=scan.nextInt();
			scan.close();
			int p=n*n;
			for(int i=1;i<=n;i++) {
				
				for(int j=1;j<=n;j++) {
					if(p<10) {
						System.out.print("0"+p-- +" ");	
					}
					else
					System.out.print(p--+" ");
				}
				System.out.println();
			}
		
		/*	output:enterr the number
					5
					25 24 23 22 21 
					20 19 18 17 16 
					15 14 13 12 11 
					10 09 08 07 06 
					05 04 03 02 01 */
	
	}
}
