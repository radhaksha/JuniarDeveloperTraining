package labs;

public class Bank_accountApp {

	public static void main(String[] args) {
		
		bankAcount acc1= new bankAcount("324220012",1000);
		//bankAcount acc2= new bankAcount("324220043",2500);
		//bankAcount acc3= new bankAcount("324220025",1500);
		
		
		acc1.setName("sasmit");
		System.out.println(acc1.getName());
		
		
		acc1.deposite(1500);
		acc1.deposite(1000);
		acc1.payBill(3000);
		acc1.accrue();
		System.out.println(acc1.toString());
		
	}
}

	
	class bankAcount implements IInterest{
		
	
	// declaring variable; properties  of bank account
			private  String  AccountNumber;// ID+ 2 random number+ first two digit of social security
			private String name;
			private static String routingNumber ="00457688";
			private double balance;
			 private static  int ID=100 ;// internal ID
			 private String ssn;



	
	public bankAcount(String ssn,double initdeposite) {
		balance= initdeposite;
				//System.out.println("bank accout is created");
				ID++;
				this.ssn= ssn;
				//System.out.println(ID);
				setAccountNumber();
			}




	void bankAccount(String ssn) {
		System.out.println("new account is created");
		
		
	}
	
	public void setAccountNumber(){
		int random= (int) (Math.random()*100);
		//System.out.println(random);
		System.out.println( "your Account number:" +ID + "" + random + ssn.substring(0,2));
		
		}
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	
	public void  payBill(double amount) {
		
		System.out.println("paying bills " +amount);
	balance= balance-amount;
	showbalance(); 
	}
	
	public void deposite(double amount) {
		
		System.out.println("making deposite of :"  +amount);
		balance= balance+amount;
		showbalance();
	}
	
	
	public void showbalance() {
		System.out.println("balance: " + balance);
	}




	@Override
	public void accrue() {
		balance= balance*(1+rate/100);
		showbalance();		
	}
	
	@Override
	public String toString() {
		return "[Name :" +name +"]\n" + " [AccountNumer : " + AccountNumber + "]\n" + "  [routingNumber :" + routingNumber + "]" + "Balance: " + balance + "]" ;
		
	}
	}