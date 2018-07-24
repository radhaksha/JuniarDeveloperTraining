package basic;

public class Strings {
	public static void main(String[] args) {
		
       String bookTitle;
       String Wordchoice= "lord";
		bookTitle= ("the lord of the rings");
		
		
		if (bookTitle.contains(Wordchoice)) {
			
			System.out.println("the book contains the word "+ Wordchoice);
		}
		
		
		
		String browser= "chrome";
		
		if(browser.equalsIgnoreCase("Chrome")){
			System.out.println("the borwser is chrome");
			
		}
		
		
		String firstName= "Radha";
		String lastName= "Sharma";
		String SSN = "890010045";
		
		// print the initial of the first and last name and last four digit of the social security number
		
		System.out.println("Ther are " + SSN.length()+ " digit in your SSN");
		
		System.out.print(firstName.substring(0, 1));
		System.out.print(lastName.substring(0, 1));// considering the given string as an array.
		System.out.print(SSN.substring(5));// printing everything after 5th digit of the SSN
	}

}

// here we did contains, equalsIgnoreCase and substring as String API.
