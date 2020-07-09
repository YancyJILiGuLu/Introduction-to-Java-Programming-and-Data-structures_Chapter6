package chapter6;

public class Q6_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Sale Amount              Commission\n");
		System.out.print("-----------------------------------");
		System.out.print("\n");
		for(int i=10;i<=1000;i+=5) {
			int saleAmount=i*100;
			System.out.printf("%d \t\t%f \n",saleAmount,computerCommission(i));
			
			
		}

	}

	public static double computerCommission(int i) {
		// TODO Auto-generated method stub
		double  ans=0;
		int saleAmount=i*1000;
		
		if(saleAmount <5000) {
			ans=500*0.08;
		}
		else if (saleAmount < 10000 && saleAmount >= 5000) {
			ans = (saleAmount-(500*0.08))*0.1;
		}
		else if (saleAmount >= 10000) {
			ans = (saleAmount-(500*0.08)-(500*0.1))*0.12;
		}
		else
			System.out.print("Invalid input");
		return ans;
	}

}
