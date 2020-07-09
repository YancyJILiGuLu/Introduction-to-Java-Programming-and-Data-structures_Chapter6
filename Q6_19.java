package chapter6;

import java.util.Scanner;

public class Q6_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.print("Enter three sides of a triangle");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();

		isValid(side1,side2,side3);
		area(side1,side2,side3);

	}

	
	public static void area(double side1, double side2, double side3) {
		// TODO Auto-generated method stub

		if (isValid(side1, side2, side3)== true) {
			double s=(side1 + side2 + side3)/2;
			double area = Math.pow((s*(s-side1)*s*(s-side2)*s*(s-side3)), 0.5);
			System.out.print("the area of this triangle is " + area);


		}


	}

	public static boolean isValid(double side1, double side2, double side3) {
		double k1 =side1 + side2;
		double k2 =side1 + side3;
		double k3 =side3 + side2;


		// TODO Auto-generated method stub
		if(k1<side3 || k2<side2 ||k3<side1 ) {
			System.out.print("The sum of two sides is less then the third one");
		}

			return false;

		
	}
}
