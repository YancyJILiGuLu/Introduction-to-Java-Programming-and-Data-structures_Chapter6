package chapter6;

public class Q6_30 {
	public static void main(String[] args) {
		// TODO Auto-generated method stubint number1= (int)(1+Math.random()*(6));
		int number1= (int)(1+Math.random()*(6));
		int number2= (int)(1+Math.random()*(6));
		int firstTry=test(number1, number2);

		if(firstTry==2 || firstTry==3 || firstTry==12) {
			System.out.printf("You rolled %d + %d  = %d, It is crap,You lose \n",number1,number2,firstTry);		
		}
		else if(firstTry==7 || firstTry==11 ) {
			System.out.printf("You rolled %d + %d = %d , It is natural,You win \n",number1,number2,firstTry);		
		}
		else {
			while(true) {
				System.out.printf("You rolled %d + %d = %d \n",number1,number2,firstTry);	
				int currentToss=test(number1, number2);
				if(currentToss==7) {
					System.out.printf("You rolled %d + %d = %d \n",number1,number2,currentToss);	
					System.out.print("You lose ");	
				}

				else if (currentToss==firstTry) {
					System.out.printf("You rolled %d + %d = %d \n",number1,number2,currentToss);	
					System.out.print("You win ");break;	
				}
			}

		}
	}

	private static int test(int number1, int number2) {
		// TODO Auto-generated method stub
		int total=number1 +number2;
		return total;

	}

}
