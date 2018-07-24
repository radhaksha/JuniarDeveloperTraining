package Lab2;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		
		StudentDatabase stu1= new  StudentDatabase("Sasmit","890010048");
		stu1.setEmail();
		stu1.setID();
		

	}}

	class StudentDatabase{
		String name; 
		 private double phone;
	private	String city;
	
	private String state;
		String ssn;
		 static int  ID= 1000;
		
		
		
		
		StudentDatabase(String name, String  ssn){
			this.name=name;
			this.ssn= ssn;
			
		}
		
		public void setEmail() {
			int random= (int) (Math.random()*100);
		String	email = name.substring(0, 4) + random + "@gmail.com";
		
		System.out.println("your email is: " + email);
		}
		
		
		
		
		StudentDatabase (String name,double phone){
			
			this.name=name;
			this.phone=phone;
			ID++;
		}
		
		
		public void setID() {
			for(int i=1000;i<9000;i++) {
			int random= (int) (Math.random()*10000);
			
			System.out.println("your user Id is:" + ID + random + ssn.substring(5) );
			}
			
			
			
			
			
		}

		public double getPhone() {
			return phone;
		}

		public void setPhone(double phone) {
			this.phone = phone;
		}

		public String getState() {
			return state;
		}

		public void setState(String state) {
			this.state = state;
		}
		
		
		
		void enroll( String name) {
			
		}
		
		
		void checkbalance( double amount) {
			
		}
		
		
		void showcourse(String name,double amount) {
			
		}
		
		public String toString() {
			return city;
			
		}
	}
	
	
	
	
	
	

