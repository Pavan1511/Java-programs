package Number_patterns;

import java.util.Scanner;

public class no_pattern_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enterr the number");
		int n=scan.nextInt();
		scan.close();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
   /*           output:
				enterr the number

					5
					12345
					12345
					12345
					12345
					12345   */