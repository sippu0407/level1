package Pattern;
import java.util.*;
public class Class18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner scn=new Scanner(System.in);
         int n=scn.nextInt();
         int nsp=0;
         int nst=1;
         
         for (int row=1;row<=n;row++) {
		        	 //space
		        	 for(int j=1;j<=nsp;j++) {
		        		 System.out.print(" ");
		        	 }
		        	 
		             if(row<=(n/2)) {
		        	   for(int col=1;col<=n-2*nsp;col++) {
				        		 if(nsp>0&&((col+nsp)!=row && (col+nsp)!=n-row+1))
				        		     System.out.print(" ");
				        		 else
				        			 System.out.print("*");
        	            }
        	 
        	            nsp=nsp+1;
        	 
            }
             
            else {
		            	
		            	for(int col=1;col<=n-2*nsp;col++) 
		           		     System.out.print("*");
		            	nsp--;
	              }
             
             
             System.out.println();
         }
         
	}

}
