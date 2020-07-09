package chapter6;
import java.util.Scanner;
public class Q6_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		

		
				Scanner input = new Scanner (System.in);
				System.out.print("Enter a number :");
				int number =input.nextInt();
				
				System.out.printf("The %d after reverse is %d ",number,reverse(number));

				


			}


			public static int reverse(int n) {
				int lastDigit=0;	
				int reversedNum=0;

				while (n != 0) {    
					lastDigit = n % 10;

					reversedNum = reversedNum * 10 + lastDigit;			    
					n = n / 10; 


				}
				// TODO Auto-generated method stub
				return reversedNum;

			}

		

	}


