package maths;
import java.util.Scanner;
public class BinaryToDecimal {

	public static int BTD(long num) {
		int pow=1;
		int ans=0;
		while(num>0) {
			long rem=num%10;
			num/=10;
			ans+=rem*pow;
			pow*=2;
		}
		return ans;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		long num=scn.nextLong();
		System.out.println(BTD(num));
		
	}

}
