package string;

import java.util.Scanner;

public class PalindromeOrNot {
     //function
	public static boolean palindrome(String str) {
		//checking first char with last char
		
	   int left=0,right=str.length()-1;
	   while(left<right) {
	   if(str.charAt(left)==str.charAt(right))
	   {
		   left++;
		   right--;
	   }
	   else
		   return false;
	   }
	   
	   return true;
	   
	}
	public static void main(String[] args) {
		
       Scanner scn =new Scanner(System.in);
       String str=scn.nextLine();
       
       System.out.println(palindrome(str));
	}

}
