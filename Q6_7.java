package chapter6;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q6_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner input = new Scanner(System.in);
		System.out.println("Enter investment amount:");
		double amount = input.nextDouble();
		System.out.println("Enter annual interest rate in percentage:");
		double annualInterestRateInPercent=input.nextDouble();

		double year=1;
		for (int i=0;i<31;i++) {
			System.out.print(i+"\t");
			System.out.printf("%.2f \n",furtureInvestmentValue(amount,annualInterestRateInPercent,i));
		}

	}

	public static double 
	furtureInvestmentValue(double investmentaAmount, double annualInterestRateInPercent, double year) {
		// TODO Auto-generated method stub
		double monthlyInterest=annualInterestRateInPercent/1200;
		double furtureInvestmentValue=0;

		furtureInvestmentValue = investmentaAmount *(Math.pow((1+monthlyInterest),year*12));


		return furtureInvestmentValue;
	}
}