package chapter6;

import java.util.Scanner;

public class Q6_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input= new Scanner(System.in);
		System.out.print("	Enter a　String :");

		String string = input.nextLine();
		System.out.print("	Enter a　character :");

		char ch = input.nextLine().charAt(0);
		System.out.print(count(string,ch));
	}

	private static int count(String string, char ch) {
		// TODO Auto-generated method stub
		int ans=0;

		for (int i=0;i<=string.length()-1;i++) {
			int charAtI = string.charAt(i);
			if(charAtI==ch) {
				ans ++;
			}

			
		}
		return ans;
	}
}