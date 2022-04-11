package maths;
import java.util.Scanner;


public class PascalTri {
	
	public static void pascal(int rows) {
	  
	  
	  for(int n=0;n<rows;n++) {
		  int ncr=1;
		 
		  for (int r=0;r<=n;r++) {
			 System.out.print(ncr);
		      ncr*=(n-r);
		      ncr/=(r+1);
		      
		  }
		  System.out.println();
		  
	  }
	}

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int num=scn.nextInt();
		pascal(num);
		
		

	}

}
