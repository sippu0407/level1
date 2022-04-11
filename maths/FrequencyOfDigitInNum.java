package maths;
import java.util.Scanner;


public class FrequencyOfDigitInNum {
    public static int frequency(int num,int digit) {
    	
    	int frequency=0;
    	while(num>0) {
    		int DigitToComp=num%10;
    		num/=10;
    		if(DigitToComp==digit) frequency++;
    	}
    	
    	return frequency;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn=new Scanner(System.in);
		int num=scn.nextInt();
		int digit=scn.nextInt();
		scn.close();
		int result=frequency(num,digit);
		
		System.out.println(result);

	}

}
