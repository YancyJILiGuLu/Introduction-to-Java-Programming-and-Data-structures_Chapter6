package chapter6;

import java.util.Scanner;

public class Q6_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.print("Enter a string");
		String s = input.nextLine();
		countletters(s);

	}

	private static int countletters(String s) {
		// TODO Auto-generated method stub
		int res=0;
		int length = s.length();

		for (int i=0;i<=s.length();i++) {
			int ch = s.charAt(i);

			if (ch >=65 && ch<=90 || ch >=97 && ch <= 122 ) {
				res++;

			}
			

		}
		return res;
	}
}