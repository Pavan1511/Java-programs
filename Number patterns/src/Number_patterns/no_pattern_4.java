package Number_patterns;

import java.util.Scanner;

public class no_pattern_4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=scan.nextInt();
		scan.close();
		for(int i=n;i>=1;i--) {    //for constant pattern decesnding we should worl on outer for loop.. 
			//int p=n;
			for(int j=1;j<=5;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
/*           output:Enter the number
					4
					44444
					33333
					22222
					11111     */