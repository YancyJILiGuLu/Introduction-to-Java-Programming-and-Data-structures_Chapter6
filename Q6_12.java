package chapter6;

import java.util.Scanner;

public class Q6_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.print("Enter char1 and char2");
		char c1 =input.next().charAt(0);
		char c2 =input.next().charAt(0);
		System.out.print("Enter the number limit for each line");
		int number =input.nextInt();
		
		
		printChars(c1,c2,number);
		
	}
		private static void printChars(char ch1, char ch2, int numberPerLine) {
		// TODO Auto-generated method stub
		
		int counter=0;
		String result=" ";
		for(int i= (int)ch1;i<= (int)ch2;i++) {
			result=Character.toString((char) i);
			counter++;
		
		if(counter % 10 ==0) {
			System.out.println(result);
		}
		else 
			System.out.print(result+"\t");

	
	
	}
		}
	
}
