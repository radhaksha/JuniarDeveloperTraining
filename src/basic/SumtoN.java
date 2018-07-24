package basic;

public class SumtoN {

	public static void main(String[] args) {
		System.out.println(sum(3));
		
		
		// sum(0)=0
		// sum(1)= 1+sum(0)= 1+0= 1
		// sum(2)= 2+sum(1)= 2+1 =3
		
		
		

	}
// using for loop
	// sum=o;
	//public static int sum(int n) {
	//for(i=0;i<=n;i++
	//sum=sum+i;
	//}
	
	//return sum;
	
	public static int sum(int n) {
		
		if(n==0) {
			return 0;
			
		}
		return(n +sum(n-1));
	}
}
