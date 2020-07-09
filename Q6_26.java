package chapter6;

public class Q6_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=2;
		int count=0;
		while(count != 100) {
			if (isPrime(i)==true && isPlinder(i)==true) {

				count++;
				if(count % 10 ==0)
					System.out.print( i + "\n");
				else 
					System.out.print( i +"\t");

			}
			i++;
		}		
	}
	private static boolean isPlinder(int i) {
		// TODO Auto-generated method stub
		int afterReverseI =0;
		
		while (i>0) {
			int rem = i%10;
			i=i/10;

			afterReverseI=afterReverseI*10+rem;
		}

		if (afterReverseI==i) {
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


