package String;

import java.util.Scanner;

public class Run_Length_Encoding {
	public static void printRLE(String s) {
		int n=s.length();
		for(int i=0;i<n;i++) {
			int count=1;
			while(i<n-1 && s.charAt(i)==s.charAt(i+1)) {
				count++;
				i++;
			}
			System.out.println(s.charAt(i));
			System.out.println(count);
		}
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the string for counting:");
		String s=scan.nextLine();
		printRLE(s);
		
	}

}
