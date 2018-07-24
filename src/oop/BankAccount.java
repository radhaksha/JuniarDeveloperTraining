package oop;

// when we are implementing IRate , we must used all method which are defined in Irate interface
// because the interface is contract.

public class BankAccount implements IRate {

// Define some variables
	 private String Name;
	String AccountNumber;
	  static   String  routingNumber="02451";
	String AccountType;
	double balance;
	 private String ssn;
	
	
	// Constructor definitions: unique methods
	// 1. they are used to define/ setup/ initialize properties of an object
	//2. constructore are implicitely called upon instantiation(they are 
	// never called, they called automatically when the object is created
	//3. the same name as the class itself
	//4. they dont have any return type
	
	 BankAccount(){
		System.out.println("New account created!");
	}
	// overloading : call the same method name with different args
	
    
	 BankAccount(String AccountType){
		
		System.out.println(" New account is " + AccountType);
	}
	
     
    
	 BankAccount(String AccountType,  double initdeposite){
 		
 		System.out.println(" saving account has " + initdeposite);
 		
 		String msg= "null";
 		if (initdeposite<1000) {
 			msg= "ERROR: minimum balance should be at least 1000";
 		}
 		else {
 			msg= (" Thanks for your initial deposite of :$" +initdeposite);
 	}
	System.out.println (msg);
	balance= initdeposite;
}

   // Getter/ Setter
     //Allow the user to define the name
     
     // here , the client set the variable called name, that variable will 
     // assign to the Name of the given class i.e this.Name= name;
     
     public void setname(String name) {
      this.Name= "Mr." + name;
     }
     
     public String getname() {
    	 return Name;
     }
     
     
     
     
     
     
     
     
public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	
	
	// interface mothod
	public void setrate() {
		System.out.println("setting Rate");
		
	}
	
	 public void IncreaseRate() {
		 System.out.println("increasing Rate");
		 
	 }
	
	
	
	
	// default modifier are available anywhere in the package
	void deposites(double amount ) {
		balance= balance+amount;
		
	}

	
	void withdraws(double amount) {
		balance= balance+amount;
		showactivity("withdraw");
		
	}
	
	void status() {
		
	}
	
	// private is is only available within class
	private void showactivity(String Activity)
	{
		System.out.println("showing recent transaction:" + Activity);
		System.out.println("your new balance is:" +balance);
	}
	void checkbalance() {
		System.out.println("balance : " +balance);
	}
	
	
	@Override
	
public String toString() {
		
		return(" [" + Name + "." +AccountNumber + ", " + "balance:" + balance+ "]");
		}

	@Override
	public void setRate() {
		// TODO Auto-generated method stub
		
	}
	}
