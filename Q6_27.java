package chapter6;

public class Q6_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count=0;
		int i=2;
		while(count != 100) {
			if (isPrime(i)==true && noPlinder(i)==true) {

				count++;
				if(count % 10 ==0)
					System.out.print( i + "\n");
				else 
					System.out.print( i +"\t");

			}
			i++;
		}		
	}
	private static boolean noPlinder(int i) {
		// TODO Auto-generated method stub
		int afterReverseI =0;
		if(i<10) {
			return false;
		}
		while (i>0) {
			int rem = i%10;
			i=i/10;

			afterReverseI=afterReverseI*10+rem;
		}

		if (isPrime(afterReverseI)==true){
			return true;
		}
		return false;
	}
	private static boolean isPrime(int i) {
		// TODO Auto-generated method stub
		boolean isPrime=true;
		for (int k=2;k<=i/2;k++) {
			if(i%k==0) {
				isPrime= false;
				break;
			}

		}
		return isPrime;
	}

}
