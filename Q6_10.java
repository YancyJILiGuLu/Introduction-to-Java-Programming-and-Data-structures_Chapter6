package chapter6;

public class Q6_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter=0;
		int number=2;

		System.out.println("The number of prime number between 0-1000 are :\n");
		for(int i=0;i<1000;i++) {
			if(isPrimeNumber(i)) {
				counter++;
			}

		}
		System.out.print(counter);
	}

		public static boolean isPrimeNumber(int number) {
			// TODO Auto-generated method stub
			for(int divisor=2;divisor<number/2;divisor++) {
				if(number %divisor==0) {
					return false;
				}
			}

			return true;
		}

	}
