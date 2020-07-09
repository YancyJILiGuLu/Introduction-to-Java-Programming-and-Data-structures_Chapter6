package chapter6;

public class Q6_24 {
	public static void main(String[] args) {

		long totalMilliSecond=System.currentTimeMillis();	
		
		//System.out.print(date);
		getCurrentDay(totalMilliSecond);

		getCurrentTime(totalMilliSecond); 
	}

	private static void getCurrentDay(long totalMilliSecond) {
		// TODO Auto-generated method stub
		
		// another easy way to get date(month,year,day is use date() or calendar()
		
		// get total days since 1970
		double totalDays=totalMilliSecond/(1000*60 * 60 *24);
		int totalYear=(int) (totalDays/365.25);
		int currentYear=(int) (totalYear+1970);
		double daysLeft=totalDays-(365.25 * totalYear);
		double month=daysLeft/30;// take 30 as average days for every month.
		String s="";
		switch ((int)month) {
		case 1:s="January";break;
		case 2:s="February";break;
		case 3:s="March";break;
		case 4:s="April";break;
		case 5:s="May";break;
		case 6:s="June";break;
		case 7:s="July";break;
		case 8:s="August";break;
		case 9:s="September";break;
		case 10:s="October";break;
		case 11:s="November";break;
		case 12:s="December";break;
		
		
		}
		 System.out.printf("The year is %d \nThe month is %s\n", currentYear,s);
		
			
	}

	private static void getCurrentTime(long totalMilliSecond) {
		// TODO Auto-generated method stub
		long totalSecond=totalMilliSecond/1000;
		long currentsecond=totalSecond%60;
		long totalMinutes=totalSecond/60;
		long currentMinutes=totalMinutes%60;
		long totalHours=totalMinutes/60;
		long currentHours=totalHours%24;
		int offset = -4;
		//System.out.print(currentHours);
		System.out.printf("Current time is: %d : %d : %d GMT",
				currentHours+ offset,currentMinutes,currentsecond);


	}
}