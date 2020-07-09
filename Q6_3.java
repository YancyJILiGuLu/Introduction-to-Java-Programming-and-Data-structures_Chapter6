package chapter6;

import java.util.Scanner;

public class Q6_3 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Enter a number :");
		int number =input.nextInt();
		
		System.out.printf("The %d after reverse is %d \n",number,reverse(number));

		if(isPalindrome(number)) {
			System.out.printf("The %d  is a palindrom",number);
		}
		else {
			System.out.printf("The %d  is not a palindrom",number);
		}


	}

	public static boolean isPalindrome(int n) {

		// TODO Auto-generated method stub

/*
		int lastDigit = n % 10;	

		int firstDigit=0;

		while (n != 0) {    
			firstDigit = n%10;		    
			n = n / 10;
		}
		if (lastDigit==firstDigit)
			return true;
		else 
			return false;
			*/
		
		int a =reverse(n);
		if (a==n)
			return true;
		else 
			return false;
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
