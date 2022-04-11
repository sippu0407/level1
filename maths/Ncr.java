package maths;

public class Ncr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
  //calculating ncr value
		
		int n=5;
		int r=4;
		
    //		ncr= nf/(rf*nmrf)
		
		int nf=1;
		for(int i=1;i<=n;i++) {
			nf*=i;
		}
		
		int rf=1;
		for(int i=1;i<=r;i++) {
			rf*=i;
		}
		
		int nmrf=1;
		for(int i=1;i<=(n-r);i++) {
			nmrf*=i;
		}
		
		int ans=nf/(rf*nmrf);
		System.out.print(ans);
	}
	
	
	//learing
//	hum same piece of code baar baar repeat kar rahe hai jaise
//	nf k liye rf ,nmrf k liye so we need to use function.

}
