package Number_patterns;

import java.util.Scanner;

public class no_pattern_3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enterr the number");
		int n=scan.nextInt();
		scan.close();
		for(int i=1;i<=n;i++) {
			int p=n;
			for(int j=1;j<=n;j++) {
				System.out.print(p--);
			}
			System.out.println();
		}
	}
}
 /*   output:enterr the number
				5
				54321
				54321
				54321
				54321
				54321   */