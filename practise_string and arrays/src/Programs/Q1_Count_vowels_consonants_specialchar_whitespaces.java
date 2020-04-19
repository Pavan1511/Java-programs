package Programs;

import java.util.Scanner;

public class Q1_Count_vowels_consonants_specialchar_whitespaces {

		public static void main(String[] args) {
		
			
			System.out.println("enter the sentence:");
			Scanner  scan=new Scanner(System.in);
			String s=scan.nextLine();
			s=s.toLowerCase();
			scan.close();
			int vowels=0,consonants=0,digits=0,spaces=0,special=0;
			for(int i=0;i<s.length();++i) {   //s.length() is a function
				//char ch=s.toLowerCase().charAt(i);
				char ch=s.charAt(i);
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
					System.out.println(ch);		
					++vowels;
				}
				else if (ch>='0' && ch<='9') {
					System.out.println(ch);
					digits++;
				}
				else if(ch>='a' && ch<='z') {
					System.out.println(ch);
					consonants++;
				}
				else if(ch == ' ') {
					++spaces;
				}
				else {
					++special;
				}
				
			}
			
			System.out.println("vowels:"+vowels);
			System.out.println("consonants:"+consonants);
			System.out.println("digits:"+digits);
			System.out.println("spaces:"+spaces);
			System.out.println("special:"+special);
		}
}

