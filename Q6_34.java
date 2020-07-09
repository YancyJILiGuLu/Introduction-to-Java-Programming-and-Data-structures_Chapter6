package chapter6;

import java.util.Scanner;

public class Q6_34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.print("Enter a year: ");	
		int year = input.nextInt();
		
		System.out.print("Enter a month: ");
		int month = input.nextInt();
		printMonth(year,month);
		
	}

	private static void printMonth(int year, int month) {
		// TODO Auto-generated method stub
		printMonthTitle(year,month);
		printMonthBody(year,month);
		
	}

	private static void printMonthBody(int year, int month) {
		// TODO Auto-generated method stub
		
		int startDay=getStartDay(year,month);
		int numberOfDaysInMonth=getNumberOfDaysInMonth(year,month);
		
		int i=0;
		for(i=0;i<startDay;i++) {
			System.out.print(" ");
		}
		for(i=i;i<numberOfDaysInMonth;i++) {
			System.out.printf("%4d",i);
			
			if ((i+startDay)%7==0);
			System.out.println( );
		}
		System.out.println();
		
	}

	private static int getNumberOfDaysInMonth(int year, int month) {
		// TODO Auto-generated method stub
		if (month==1||month==3||month==5||
		month==7||month==8||month==10||month==12)
		return 31;
		if (month==4||month==6||month==9||
				month==11)
				return 30;
		
		if (month==2)return isleapYear(year)?29:28;
		return 0;
		
	}

	private static boolean isleapYear(int year) {
		// TODO Auto-generated method stub
		
		return year%400 ==0 || (year %4 ==0 && year % 100 != 0);
	}

	private static int getStartDay(int year, int month) {
		// TODO Auto-generated method stub
		
		int q =1;
		if (month==1 ) {
			month=13;
			year = year-1;
		}
		else if (month==2) {
			month=14;
			year = year-1;
		}
		int j=year/100;
		int k=year%100;
		
		int answer = (q + (26*(month+1)/10)+k+(k/4)+(j/4)+5*j)%7;
		
		return answer;
	}

	private static void printMonthTitle(int year, int month) {
		// TODO Auto-generated method stub
		System.out.println(" "+ getMonthName(month)+ " "+ year);
		System.out.println("---------------------------------");
		System.out.println("Sun  Mon  Tue  Wed  Thu  Fri  Sat");
		
	}

	private static String getMonthName(int month) {
		// TODO Auto-generated method stub
		
		
		String ans=" ";
		switch(month) {
		case 1: ans="January";break;
		case 2: ans="February";break;
		case 3: ans="March";break;
		case 4: ans="April";break;
		case 5: ans="May";break;
		case 6: ans="June";break;
		case 7: ans="Juny";break;
		case 8: ans="August";break;
		case 9: ans="September";break;
		case 10: ans="October";break;
		case 11: ans="November";break;
		case 12: ans="December";break;

		
		// TODO Auto-generated method stub

		}
		return ans;
		
	}

}
