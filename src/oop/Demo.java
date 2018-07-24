package oop;




class Person {
String	name;
	String email;
	String phone;
	


 void walk(){
	 System.out.println(name + " is walking");
 }
	


 void eat(){
	 System.out.println(name + " is eating");
	 
 }
	


void sleep() {
System.out.println(name + " sleeping");
}
}
	
	public class Demo {


	public static void main (String[] args) {
		// instantiating an object
	Person person= new Person();
	
	// define some properties
	person.name = "radha";
	person.email ="adhradha@gmail.com";
	person.phone= "7348837871";
	
	//Abstraction
	person.walk();
	person.sleep();
	person.eat();
	
	
	Person person1= new Person();
	person1.name= "sasmit";
	person1.sleep();
	
		
	
		//person
		// Attributes, variable, adjective,descriptors
		
		/*String name="radha";
		String email= "adhradha@gmail.com";
		String phone= "7348837871";
		
		//Action, activity,behavior
		
		//System.out.println( name+ " is walking");
		walking(name);

		System.out.println(name + " is eating");
		
		
		
		// what if we want to do this by second person
		String name1="sasmit";
		String email1= "sasradha@gmail.com";
		String phone1= "7348837872";
		
		//Action, activity,behavior
		
		//System.out.println( name1+ " is walking");
		
		walking(name1);

		System.out.println(name1 + " is eating");
		
		
		
		// this is not the most efficient way of doing this ,so one way to enhance by adding the funtion to minimise the code
	
	}
	static void walking ( String name) {
		System.out.println(name + "is walking");
	}
	
	
	// what about binding attributes and properties together?
	 * 
	 */
	
	}
	}

