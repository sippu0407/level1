package functions;

public class Ncr {
	
	public static int factorial(int num) { 
		int result=1;
		for(int i=1;i<=num;i++) result*=i;
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;
		int r=4;
		
    //		ncr= nf/(rf*nmrf)
		
		int nf=factorial(n);
		int rf=factorial(r);
		int nmrf=factorial(n-r);
		
		int ans=nf/(rf*nmrf);
		System.out.print(ans);

	}

}
