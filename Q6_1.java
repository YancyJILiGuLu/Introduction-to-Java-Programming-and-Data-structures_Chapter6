package chapter6;

public class Q6_1 {

	public static void main(String[] args) {
		int n=0;
		getPentagonalNumber(n);		
	}
	public static void getPentagonalNumber(int n) {
		// TODO Auto-generated method stub
		int result=0;

		for(int i=0;i<100;i++) { 
			result=i*(3*i-1)/2;
			if(i %10 ==0) {
				System.out.println(result);
			}
			else {
				System.out.print(result+"\t");

			}

		}
	}
}