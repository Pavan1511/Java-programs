package Number_patterns;

import java.util.Scanner;

public class no_pattern_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enterr the number");
		int n=scan.nextInt();
		scan.close();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
  /*
    
 output : enterr the number
   				5
				11111
				22222
				33333
				44444
				55555   */