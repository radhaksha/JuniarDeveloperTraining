package basic;

public class FibonancyApp {

	public static void main(String[] args) {
		
		System.out.println(fib(7));
	
		
	}
	
		
	
	
	// fibonnancy number is defined by the sum of two previous fibonnancy number
	// fib(0)=0
	// fib(1)=1
	// fib(2)= fib(0) +fib(1)= 0+1=1
	// fib(3)= fib(2) +fib(1)= 1+1=2
	// fib(4)= fib(3) +fib(2)= 2+1=3
	// fib(5)= fib(4) +fib(3)= 3+2=5
	//fib(6)= fib(5) +fib(4)=5+3=8
	// fib(7)= fib(6) +fib(5)= 8+5=13
		
		public static int fib(int n) {
			
			if(n==0) {
				return 0;
			}
				else if (n==1) {
					return 1;
				}
			
			return((fib(n-1))+  ( fib(n-2))) ;
			}
		}

	


