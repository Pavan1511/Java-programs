package Methods_to_swap;

import java.util.Scanner;

public class Method_2 { 
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two variable A and B to be swapped:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		a=(a+b)-(b=a);
		System.out.println("number after swap:"+a+" "+b);
	}

}
