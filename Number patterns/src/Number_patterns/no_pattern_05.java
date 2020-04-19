package Number_patterns;

import java.util.Scanner;

public class no_pattern_05 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=scan.nextInt();
		scan.close();
		int p=1;
		for(int i=1;i<=n;i++) {    
		
			for(int j=1;j<=n;j++) {
				if(p<10) {
					System.out.print("0"+ p++ +" ");
				}else
				System.out.print(p++ + " ");
			}
			System.out.println();
		}
	}
}
  /* 			Output:Enter the number
						5
						01 02 03 04 05 
						06 07 08 09 10 
						11 12 13 14 15 
						16 17 18 19 20 
						21 22 23 24 25   */