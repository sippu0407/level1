package BinarySearch;

import java.util.Scanner;

public class FloorAndCealOfDataInArray {
	
	//defining binary search function
	
		public static int binarySearch(int a[],int ele) {
			int left=0;
			int right=a.length-1;
			while(left<=right) {
				int mid=left+((right-left)/2);
				
				//agar value match kar gayi
				if(a[mid]==ele) return mid;
				
				//agar mid pe value choti thi key se
				else if(a[mid]<ele) left=mid+1;
				
				else right=mid-1;
			}
			
			return -1;
		}

	public static void main(String[] args) {
		
		//taking input
				Scanner scn=new Scanner(System.in);
				int n=scn.nextInt();
				int sortedArr[]=new int[n];
				
				for(int i=0;i<sortedArr.length;i++)
					 sortedArr[i]=scn.nextInt();
				
				int key=scn.nextInt();
				
				//calling binary search function
				
				int index=binarySearch(sortedArr,key);
	
				//printing floor and ceal
      if(index!=-1)	
      {
    	  //edge condition
        if(index>0)
          System.out.print("floor ->"+sortedArr[index-1]);
        else
        	System.out.print("floor -> none");
        
        if(index<sortedArr.length-1)
        	System.out.print("| seal ->"+sortedArr[index+1]);
        else 
        	System.out.print("| seal -> none");
		
      }
      else
    	  System.out.print("floor -> none | seal -> none");
      
	}

}
