package oop;

public class BankaccountApp {

	public static void main(String[] args) {
		
		BankAccount bankaccount= new BankAccount();
		
		// Polymorpism through overloading(same name with different argument)
		
		BankAccount bankaccount1= new  BankAccount("checking Account");
		
        BankAccount bankaccount2= new BankAccount("saving account" , 5000);
		
		
        
        
        
        bankaccount1.AccountNumber="02245";
		//bankaccount1.Name="sasmit";
		// with encapsulations: public API methods
		
		bankaccount1.setname("sasmit");
		 System.out.println(bankaccount1.getname());
		
		 
		 bankaccount1.setSsn("0045678");
		 System.out.println(bankaccount1.getSsn());
		 
		 
		 bankaccount1.setrate();
		 bankaccount.IncreaseRate();
		 
		 
		 
		 
		 
		 
		
		bankaccount1.balance= 2000;
		
		
		//polymorphism through overriding
		System.out.println(bankaccount1.toString());
	
		
		
		
		System.out.println(bankaccount.routingNumber);

		
		System.out.println(bankaccount1.routingNumber);

		
		System.out.println(bankaccount2.routingNumber);
		
		// demo for inheritance
		
		
		CdAccount cd1= new CdAccount();
		cd1.balance= 4000;
		//cd1.Name ="sapkota";
		cd1.interestRate= "3";
		cd1.AccountType= "CD Account";
		System.out .println(cd1.toString());
		cd1.compound();
		

	}

}  
