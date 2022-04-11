package maths;
import java.util.*;
public class DecimalToAnyBase {
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Scanner scn=new Scanner(System.in);
		long num=scn.nextLong();
		long base=scn.nextLong();
		scn.close();
		System.out.println(DecimalTOany(num,base));
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

}
