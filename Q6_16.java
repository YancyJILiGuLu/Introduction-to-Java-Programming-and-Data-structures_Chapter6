package chapter6;

public class Q6_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i=0;i<=20;i++) {
			int k=2000+i;
			System.out.print(k+"\t");
			numberOfDaysInAYear(k);
			System.out.print("\n");
		}

	}

	public static void numberOfDaysInAYear(int year) {
		// TODO Auto-generated method stub


		if (isleapYear(year))
			System.out.print(366);

		else 
			System.out.print(365);

		return;
	}

	private static boolean isleapYear(int year) {
		// TODO Auto-generated method stub
		return year%400 ==0 || (year %4 ==0 && year % 100 !=0);

	}


}


