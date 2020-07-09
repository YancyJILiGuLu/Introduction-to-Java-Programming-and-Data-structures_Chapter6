package chapter6;

public class Q6_14 {

	
		public static void main(String[] args) {
			// TODO Auto-generated method stub


			System.out.print("i              m(i)\n");
			System.out.print("---------------------\n");
			for(int i=0;i<10;i++) {
				int k=1+i*100;
				System.out.printf("%d \t\t%.4f \n",k,sumOfArray( k));


			}

		}
		public static double sumOfArray(int num) {

			// TODO Auto-generated method stub
			
			
			double a3=0;
			for(int i=1;i<=num;i++) {
				
				double a1=Math.pow(-1, i+1.0);
				double a2=2*i-1;
				a3 +=((a1)/(a2));
				
			}
			return 4*a3;
		}

	}


