package Pattern;

import java.util.Scanner;

public class Pattern17 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

				 
				 Scanner s=new Scanner(System.in);
				 int n=s.nextInt();
				 s.close();
				 int nsp=n/2;
				 int nst=1;
				 
				 //rows
				 for(int rows=1;rows<=n;rows++) {
					 
					 //columns before space
					
				
					 //columns of space
					 for(int colSpa=1;colSpa<=nsp;colSpa++) {
						 System.out.print(" ");
						
					 }
				
					 //columns after space
					 for(int col=1;col<=nst;col++) {
						 
						 System.out.print("*");
						
					 }
					 
					 //next row logic
					 
					System.out.println();
					
					
					if(rows<=n/2) {
						nst+=1;
					}
					
					if(rows==nsp) {
						nst=nst+nsp;
						nsp=0;
					}
					
					else {
						nsp=n/2;
						nst=n-rows;
					}
				 }
			
	}

}
