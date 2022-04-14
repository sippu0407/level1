package array;

import java.util.Scanner;

public class FindEleInArray {
	
	//search function
	public static int search(int a[],int d) {
		int i=0;
		while(i!=a.length) {
			if(d==a[i]) return i;
			i++;
		}
		
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		Scanner scn=new Scanner(System.in);
		int num=scn.nextInt();
		
		int []arr=new int[num];
		for(int i=0;i<arr.length;i++) {
			arr[i]=scn.nextInt();		
			
		}
		int ele=scn.nextInt();
		 System.out.println(search(arr,ele));	
			
		
	}

}
