package basic;

public class FactorialApp {

	public static void main(String[] args) {
		
		
		System.out.println(fact(4));
		System.out.println(fact(1));
		System.out.println(fact(2));
		System.out.println(fact(5));
		System.out.println(fact(10));

	}

	
	
	// 1! = 1
	//2! = 2 * 1! = 2 * 1
	// 3! = 3 * 2! = 3 * 2 * 1! = 3 * 2 * 1
	// 4! = 4 * 3! = 4 * 3 * 2! = 4 * 3 * 2 * 1! = 4 * 3 * 2 * 1
	
	public static int fact(int n) {
		
		if(n==0) {
			return 1;
		}
		else if(n==1) {
			return 1;
		}
		else if (n==2) {
			return 2;
		}
		return (n* fact(n-1));
	}
}
