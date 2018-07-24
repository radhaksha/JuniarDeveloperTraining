package oop;

public class Accountapp {

	public static void main(String[] args) {
		LoanAccount la= new LoanAccount();
		la.setRate();
		la.IncreaseRate();
		la.setAmtorSchedule();
		la.setTerm(15);
		
		
		
		// polymorphism changing where we are pointing
		
		// here, we are creating the object account1 based on IRate properties but it is pointing to 
		// loanAccount properties
		IRate account1= new LoanAccount();
		account1.IncreaseRate();
		account1.setRate();
		

	}
	
	
	
}
