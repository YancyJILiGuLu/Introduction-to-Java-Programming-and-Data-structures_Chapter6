package chapter6;



public class Q6_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number =1000;
		int save=0;
		for(int i=0;i<number;i++) {
			if (isPrime(i)==true) {
				if (i-2==save);
				System.out.printf("(%d,%d) are douible prime \n", i,save);
				save=i;

			}		
		}

	}

	private static boolean isPrime(int i) {
		// TODO Auto-generated method stub
		boolean isPrime=true;
		for(int k=2;k<=i/2;k++) {
			if (i%k==0) {
				isPrime=false;
				break;
			}
		}
		return isPrime;
	}




}


