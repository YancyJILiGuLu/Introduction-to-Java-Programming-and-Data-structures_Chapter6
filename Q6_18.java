package chapter6;

import java.util.Scanner;

public class Q6_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.print("Enter a password");
		String password = input.nextLine();

		testLength(password);
		testOnlyNAndC(password);
		testNumber(password);

	}

	public static void testNumber(String password) {
		// TODO Auto-generated method stub

		int length = password.length();
		if(length != 8){
			System.out.print("Invalid password, the password at least contain 8 characters and numbers");
		}

	}

	public static void testOnlyNAndC(String password) {
		// TODO Auto-generated method stub
		int length = password.length();
		for (int i=0;i<=password.length()-1;i++) {

			int ch = password.charAt(i);

			if (ch < 48 || ch >57 ||ch <65 || ch>90 || ch <97 || ch > 122 ) {
				System.out.print("Invalid password, the password can only contain  characters and numbers");
			}

		}

	}



	public static void testLength(String password) {
		// TODO Auto-generated method stub
		int counter =0;
		for (int i=0;i<=password.length()-1;i++) {

			int ch = password.charAt(i);
			if (ch >= 48 && ch <=57 )
				counter ++;

		}
		if (counter != 2) {
			System.out.print("Invalid password, "
					+ "the password must contain  at least two  numbers");
		}

	}

}
