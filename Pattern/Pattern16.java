package Pattern;

import java.util.Scanner;

public class Pattern16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

				 
				 Scanner s=new Scanner(System.in);
				 int n=s.nextInt();
				 s.close();
				 int nsp=n*2-3;
				 
				 //rows
				 for(int rows=1;rows<=n;rows++) {
					 
					 //columns before space
					 int count=0;
					 for(int colBef=1;colBef<=(n+3-nsp)/2;colBef++) {
						 count++;
						 System.out.print(count);
						
					 }
					 
					 //columns of space
					 for(int colSpa=1;colSpa<=nsp;colSpa++) {
						 System.out.print(" ");
						
					 }
					 if(nsp<=0) count--;
					 //columns after space
					 for(int col=count;col>=1;col--) {
						 
						 System.out.print(count);
						 count--;
					 }
					 
					 //next row logic
					 
					 nsp-=2;
					 System.out.println();
				 }
			
	}

}
