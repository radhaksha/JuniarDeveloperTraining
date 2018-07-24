package basic;

public class weather {
	public static void main(String[] args) {
		// declare variable
		int temp;
		String suncondition;
		// initialize variable
		temp= 86;
		suncondition="sunny";
		
		if(temp>50 &&suncondition=="overcast" ) {
			System.out.println(" its little chilly, wear warm clothes");
		}
		
		 if (temp > 85 && suncondition =="sunny" ) {
			System.out.println("its hot outside,wear short and tshirt ");
		}
		
		else
			System.out.println("its cold outsise, wear jackets");
	
	
	System.out.println("program is ending");

}}
