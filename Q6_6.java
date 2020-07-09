package chapter6;

import java.util.Scanner;

public class Q6_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the lines of table :");
		int n = input.nextInt();
		displaypattern(n);

	}

	public static void displaypattern(int num) {
		// TODO Auto-generated method stub

		for(int i=1;i<num;i++) {
			System.out.print(" \n");
			for(int l=1;l<num-1;l++) {
				System.out.print(" ");
			}
			for(int l=i;l>=1;l--) 
				System.out.print(l);


		}
		for(int i=1;i<7;i++) {
			System.out.print(" \n");
			for (int j=1;j<7-i;j++) {
				System.out.print(" ");
			}
			for (int j=i;j>=1;j--)
				System.out.print(j);
		}
	}

}



