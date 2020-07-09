package chapter6;

import java.util.Calendar;

public class Q6_33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar c=Calendar.getInstance();
		c.setTimeInMillis(System.currentTimeMillis());

		String year =c.get(Calendar.YEAR)+" ";
		int month =c.get(Calendar.MONTH);

		String days =c.get(Calendar.DAY_OF_MONTH)+" ";
		String hours =c.get(Calendar.HOUR_OF_DAY)+" ";
		String minutes =c.get(Calendar.MINUTE)+" ";
		String seconds =c.get(Calendar.SECOND)+" ";
		getMonthInString(month);

		System.out.print("Current date and time is " +getMonthInString(month)+" "+
				days+year+ "\t"+ hours +":"+minutes+":"+seconds);




	}

	private static String getMonthInString(int month) {
		String ans=" ";
		switch(month) {
		case 1: ans="Jan";break;
		case 2: ans="Feb";break;
		case 3: ans="Mar";break;
		case 4: ans="Apr";break;
		case 5: ans="May";break;
		case 6: ans="June";break;
		case 7: ans="Juny";break;
		case 8: ans="Aug";break;
		case 9: ans="Sep";break;
		case 10: ans="Oct";break;
		case 11: ans="Nov";break;
		case 12: ans="Dec";break;

		
		// TODO Auto-generated method stub

		}
		return ans;
	}
}
