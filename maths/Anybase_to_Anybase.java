package maths;

import java.util.Scanner;

public class Anybase_to_Anybase {
	
	//anybase to decimal
	public static int ABTD(long num,long base) {
		int pow=1;
		int ans=0;
		while(num>0) {
			long rem=num%10;
			num/=10;
			ans+=(rem*pow);
			pow*=base;
		}
		return ans;
	}
	

	public static long DecimalTOany(long num,long base) {
		long pow=1;long ans=0;
		while(num>0) {
			long rem=num%base;
			num/=base;
			ans+=(rem*pow);
			pow*=10;
		}
		
		return ans;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		long num=scn.nextLong();
		long base1=scn.nextLong();
		long base2=scn.nextLong();
		scn.close();
		int deci=ABTD(num,base1);
		System.out.println(DecimalTOany(deci,base2));
	}

}
