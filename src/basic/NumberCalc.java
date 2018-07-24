package basic;

public class NumberCalc {
	
	public static void main(String [] args) {
		PrintName();
		int numA= 15;
		int numB= 25;
		addnumber(numA,numB);
	 int product= multiplynumber(numA, numB);
	 
	System.out.println("The product of two numbers is " + product);
		
		}
static void PrintName() {
	System.out.println("My name is Radha");
	}

	
	
	static void addnumber(int numberA, int numberB) {
		int sum= numberA + numberB;
		System.out.println("The sum of two numbers " + numberA + " and " +numberB + " is " +sum);
		
	}
	
	
	static int multiplynumber( int valueA, int valueB) {
		int product= valueA*valueB;
		addnumber(product+100, product);
		
		return product;
	}
	
	
	
}

