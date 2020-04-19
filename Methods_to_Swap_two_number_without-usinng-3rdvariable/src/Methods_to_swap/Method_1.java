package Methods_to_swap;

import java.util.Scanner;

public class Method_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two variable A and B to be swapped:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		a=a+b;   //a=4+5=9
		b=a-b;   //b=9-5=4
		a=a-b;   //a=9-4=5
		System.out.println("number after swap:"+a+" "+b);
	}

}
