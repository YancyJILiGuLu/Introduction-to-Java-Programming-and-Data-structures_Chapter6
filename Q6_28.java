package chapter6;

public class Q6_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int counter=0;	
		System.out.print( "P       2^p-1\n" );
		
		
		for (int k=2;k<=31;k++) {

			if (isPerime(k)) {
				isMS(k);
				if(counter % 10 ==0)
				System.out.printf("%d % d",k,isMS(k) );
				else 
					System.out.print(k +"\t");	
				
				counter++;
			}
		}
	}
	private static double isMS(int i) {

		double ans=0;
		ans=(Math.pow(2, i))-1;
	
		return ans;

	}
	private static boolean isPerime(int i) {
		for(int k=2;k<i/2;i++) {
			if (i%k==0) {
				return false;
			}
			
		}
		return true;
	}

}
