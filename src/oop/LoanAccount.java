package oop;

public class LoanAccount implements IRate {

	@Override
	public void setRate() {
		System.out.println("rate");
		
		
	}

	@Override
	public void IncreaseRate() {
		
		System.out.println("increasing rate");
		
	}
	
	
	
	public void setTerm(int term) {
		 System.out.println("setting the term to:" + term + "year");
	}

	public void setAmtorSchedule() {
		System.out.println("Amortiozation is schedule");
	}

}
