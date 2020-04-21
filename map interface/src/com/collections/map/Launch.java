package com.collections.map;
import java.util.HashMap;
import java.util.Scanner;

public class Launch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		HashMap<String,Integer> details = new HashMap<String,Integer>();
		
		System.out.println("Enter the number of employess");
		int size = scan.nextInt();
		
		System.out.println("Enter the details: name = number");
		for(int i=0;i<size;i++) {
			//data enterred, format name = number;
			String data = scan.next();
			//data split in two parts name=0 and number=1
			String[] split = data.split("=");
			//adding the details to the HashMap 
			details.put(split[0],Integer.parseInt(split[1]));
		}
		
		System.out.println("Enter the names to fetch there data");
		String[] names = new String[size];  //string array declaration of length size
		
		for(int i=0;i<size;i++) {
			names[i]=scan.next();
		}
		
		for(int i=0;i<size;i++) {
			if(details.containsKey(names[i]))
				System.out.println(details.get(names[i]));
			else
				System.out.println("person Missing");
		}
	}

}
