package chapter6;

public class Q6_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//double celsius=0;
		System.out.printf("%s\t%s\t%s\t%s\n","Celsius","Fahrenheit","Fahrenheit","Celsius");
		System.out.printf("------------------------------------------------\n");
		
		for (int i=40;i>=31;i--) {
			
			//int i=40*a;
			System.out.print(i+"\t");
			System.out.printf("%.1f \t\t",celsiusToFahrenheir(i));

		
		
			double k=i*3;
			
			System.out.print(k+"\t\t");
			System.out.printf("%.1f\t",FahrenheitToCelsius(k));
			System.out.print("\n");
		}
		
		}
	
	

	public static double FahrenheitToCelsius(double fehrenheit) {
		// TODO Auto-generated method stub
		double result=0;
		result=(5.0/9)*(fehrenheit -32);
		return result;
	}

	public static double celsiusToFahrenheir(double celsius) {
		// TODO Auto-generated method stub

		double result;
		result=(9.0/5)*celsius+32;
		return result;
	}
	
	
}