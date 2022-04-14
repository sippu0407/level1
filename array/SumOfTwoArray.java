package array;

import java.util.Scanner;

public class SumOfTwoArray {
	
	public static void SOTA(int a[],int b[] ){
	
		//intializing maxLength out of two array
		int maxLength=0;
		if(a.length>=b.length) maxLength=a.length;
		else maxLength=b.length;
		
		//creating output array
		int result[]=new int[maxLength+1];
		
		//intializing few variables
		 int n1=a.length;
		 int n2=b.length;
		 int carry=0;
		 
		//reverse traversing through arrays
		while(maxLength>=0) {
			int d1=0,d2=0,add=0;
			
			if(n1>0)d1=a[n1-1];
			else d1=0;
			
			if(n2>0) d2=b[n2-1];
			else d2=0;
			
			add=d1+d2+carry;
			
			//finding remainder and quotient
			int rem=add%10;
			int quo=add/10;
			
			//adding output to result array
			result[maxLength]=rem;
			
			//updating variables
			n1--;
			n2--;
			maxLength--;
			carry=quo;
		}
		
		//output result
		for(int i=0;i<result.length;i++)
			if(i==0&&a[i]==0);
			else
		     System.out.print(result[i]);
	}
	

	public static void main(String[] args) {
	
		//input  first array
		Scanner scn=new Scanner(System.in);
		int n1=scn.nextInt();
		
		int []arr1=new int[n1];
		for(int i=0;i<arr1.length;i++)
			    arr1[i]=scn.nextInt();		
		
		//second array input
        int n2=scn.nextInt();
		int []arr2=new int[n2];
		for(int i=0;i<arr2.length;i++)
			    arr2[i]=scn.nextInt();	
		
		//function calling
		SOTA(arr1,arr2);
			

	}

}
