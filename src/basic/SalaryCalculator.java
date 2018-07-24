package basic;

public class SalaryCalculator {
	public static void main(String[] args) {
		//define variable
		double salary;
		float hoursPerWeek;
		int weekPerMonth;
		double rate;
		// declare variable
		hoursPerWeek = 40;
		weekPerMonth =52;
		rate = 45;
		String career= "software developer";
		
		salary=hoursPerWeek*weekPerMonth*rate; 
		System.out.println("the salary of  " +career +" with the rate of "+ rate +" per hour is "+ salary + " per year" );
		
	}

}
