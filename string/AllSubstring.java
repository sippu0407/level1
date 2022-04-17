package string;

import java.util.Scanner;

public class AllSubstring {
    
	public static void substr(String str) {
		
		//lopping
		for(int si=0;si<str.length();si++) {
			for(int ei=si;ei<str.length();ei++)
				System.out.println(str.substring(si,ei+1));
		}
	}
	public static void main(String[] args) {
		
		 Scanner scn =new Scanner(System.in);
	       String str=scn.nextLine();
	       
	       substr(str);
	}

}
