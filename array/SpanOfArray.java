package array;

import java.util.Scanner;

public class SpanOfArray {
	
	
	//implementing function
	public static int span(int a[]) {
		int max=a[0],min=a[0];
		//traversing array for max and min ele
		for(int i=1;i<a.length;i++) {
			//for max
			
			if(a[i]>max) max=a[i];
			
			else if(a[i]<min) min=a[i];
			
		}
		
		return max-min;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn=new Scanner(System.in);
		int num=scn.nextInt();
		int []arr=new int[num];
		for(int i=0;i<arr.length;i++) {
			arr[i]=scn.nextInt();		
			
		}
		
		
	  System.out.println(span(arr));	
			
		

	}

}
