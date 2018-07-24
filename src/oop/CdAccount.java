package oop;


// public are available in the project
public class CdAccount extends BankAccount implements IRate {
	
	String interestRate;
	
	void compound() {
		System.out.println("compounding interest");
	}

}
