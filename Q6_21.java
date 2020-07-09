package chapter6;

import java.util.Scanner;

public class Q6_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.print("	Enter a　letter :");
		
		String letter = input.nextLine();
		
		
		for (int i=0;i<=letter.length()-1;i++) {
			char le = Character.toUpperCase(letter.charAt(i));
			
		System.out.print(getNumber(le));
		}
		

	}

	private static int getNumber(char uppercaseLetter) {
	
		// TODO Auto-generated method stub
		int res=0;
		String a="";
		
		if (uppercaseLetter =='A' ||uppercaseLetter =='B' ||uppercaseLetter =='C') {
			a="2";
		}
		else  if (uppercaseLetter =='D' ||uppercaseLetter =='E' ||uppercaseLetter =='F') {
			a="3";
		}
		else if (uppercaseLetter =='G' ||uppercaseLetter =='H' ||uppercaseLetter =='I' ) {
			a="4";
		}
		else if(uppercaseLetter =='J' ||uppercaseLetter =='K' ||uppercaseLetter =='L' ) {
			a="5";
		}
		else if(uppercaseLetter =='M' ||uppercaseLetter =='N' ||uppercaseLetter =='O' ) {
			a="6";
		}
		else  if (uppercaseLetter =='P' ||uppercaseLetter =='Q' ||uppercaseLetter =='R'|| uppercaseLetter=='S') {
			a="7";
		}
		else if (uppercaseLetter =='T' ||uppercaseLetter =='U' ||uppercaseLetter =='V' ) {
			a="8";
		}
		else if(uppercaseLetter =='W' ||uppercaseLetter =='X' ||uppercaseLetter =='Y' ||uppercaseLetter=='Z') {
			a="9";
		}
		else 
			System.out.print("Invalid input");
		
		return res;
	}

}
