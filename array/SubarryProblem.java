package array;

import java.util.Scanner;

public class SubarryProblem {

	//defining subarray function
	public static void subarray(int a[]) {
		for(int si=0;si<a.length;si++) {
			for(int subsi=si; subsi<a.length; subsi++) {
				for(int j=si;j<=subsi;j++) {
					System.out.print(a[j]+" ");
				}
				System.out.println();
			}
		}
	}
	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int []arr1=new int[n];
		for(int i=0;i<arr1.length;i++)
			    arr1[i]=scn.nextInt();
		
		subarray(arr1);


	}

}
