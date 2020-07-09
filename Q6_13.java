package chapter6;



public class Q6_13 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.out.print("i              m(i)\n");
		System.out.print("---------------------\n");
		for(int i=1;i<=20;i++) {

			System.out.printf("%d \t\t%.4f \n",i,sumOfArray( i));


		}

	}

	public static double sumOfArray(int num) {

		// TODO Auto-generated method stub
		double ans=0;
		
		for(int i=1;i<=num;i++) {
			ans += i/(i+1.0);
			
		}
		return ans;
	}
}


