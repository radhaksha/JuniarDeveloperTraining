package basic;

public class Cities {
	public static void main(String[] args) {
		
		
		String[] cities= {"waltham", "Newton", "belmont","Natick"};
		// declare and define arrays
		
		System.out.println("cities are- ");
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		System.out.println(cities[3]);
		
		
		
		// declare and define arrays
		
		//t n=0;
		
	String[] States= new String[3];
		States[0]= "texas";
		States[1]= "Messachusetts";
		States[2]=  " New York";
		
		System.out.println("States are-");
		System.out.println(States[0]);
		System.out.println(States[1]);
		System.out.println(States[2]);
		
		
		
System.out.println("***************************");
System.out.println("States are:-");
		
		
		
	// using while loop, While loop check the condition and enter the loop
	// while(n<3) {
	//	 System.out.println(States[n]);
	//	 n++;
	 //}
		
		
		// declare arrays
		
		String []countires;
		
		// define arrays 
		countires = new  String[3];
		countires[0]="USA";
		countires[1]="NEPAL";
		countires[2]="China";
		System.out.print("Countries are- \n");
		
		//System.out.println(countires[0]);
		//System.out.println(countires[1]);
		//System.out.println(countires[2]);
		
		int i= 0;
		do {
			
			// do loops :- enters the loop and then check the condition
			
			System.out.println(countires[i]);
			i=i+1;
		}
		
	
		
			while(i<2);
	
	
	
	// while loop test the condition first and then enters the loop
	

	
	

	System.out.println("***************************");
	
	
	
	 
	
	 String [] states=new String[3];
	 states[0]= "texas";
	 states[1]= "Messachusetts";
	 states[2]=  " New York";
	
	
	int m=0;

	boolean statesfound = true ;
	while (statesfound) {
		String sstates= states[m];
		if(sstates=="Messachusetts") {
			
		System.out.println("States found!");
		statesfound=false;
		
	}
	m++;
	

}
	
	// best structure through itteration array
	
	System.out.println("printing with for loop\n");
	
	
	for(int x=0;x<3;x++) {
		System.out.println(states[x]);
	}
}}

		
		
		
		
		
		
	
		
				
	


