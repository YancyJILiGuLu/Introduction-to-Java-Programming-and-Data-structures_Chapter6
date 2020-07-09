package chapter6;

import java.util.Scanner;

public class Q6_25 {
	public static void main (String [] args) {
		
		System.out.print("Enter a milliSecond :");
		Scanner input= new Scanner (System.in);
		long millis = input.nextLong();
		
		converMillis( millis);
		
	}

	private static void converMillis(long millis) {
		// TODO Auto-generated method stub
		
		long totalsecond = millis /(1000);
		
		long second=totalsecond%60;
		long totalminute = totalsecond /60;		
		long minute = totalminute%60;
		long hours = totalminute /60;
		
		
		System.out.print(" Hours : Minute : Second \n" );
		System.out.printf(" %d\t :%d \t:%d",hours,minute,second );
	}

}
