package chapter6;

public class Q6_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long n=234;

		System.out.print(sumDigits(n));

	}

	public static int sumDigits(long n) {
		int result=0;
		for (int i=0;i<3;i++) {
			result=(int) (n%10)+result;
			n =(int) (n/10);

		}
		return result;


	}

}
