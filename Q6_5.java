package chapter6;

public class Q6_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n1=1.23;
		double n2=2.34;
		double n3=4.56;
		displaySortedNumbers(n1,n2,n3);
	}
	public static void displaySortedNumbers(double num1,double num2,double num3) {
		
		if(num1>num2 && num2 >num3) {
			System.out.printf("The order an ascending is: %f %f %f",num3,num2,num1);
		}
		else if(num1>num3 && num3 >num2) {
			System.out.printf("The order an ascending is: %f %f %f",num2,num3,num1);
		}
		else if(num2>num3 && num3 >num1) {
			System.out.printf("The order an ascending is: %f %f %f",num1,num3,num2);
		}
		else if(num2>num1 && num1 >num3) {
			System.out.printf("The order an ascending is: %f %f %f",num3,num1,num2);
		}
		else if(num3>num1 && num1 >num2) {
			System.out.printf("The order an ascending is: %f %f %f",num2,num1,num3);
		}
		else if(num3>num1 && num1 >num2) {
			System.out.printf("The order an ascending is: %f %f %f",num2,num1,num3);
		}
		else if(num3>num2 && num2 >num1) {
			System.out.printf("The order an ascending is: %f %f %f",num1,num2,num3);
		}
		else {
			System.out.print("Invalid input");
		}
		
		
	}
}
