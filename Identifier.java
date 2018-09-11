package assignment1;

import java.util.Scanner;
import java.io.PrintStream;
import java.util.regex.Pattern;

public class Identifier implements IdentifierInterface {
	
	PrintStream out;
	char openParenthesis = '{';
	char closeParenthesis = '}';
	
	Identifier(){
		out = new PrintStream(System.out);
	}
	
	Identifier(Identifier src);
	
	
	boolean nextCharIsDigit (Scanner in) {
		return in.hasNext("[0-9]");
	}
	
	
	boolean nextCharIsLetter (Scanner in) {
		return in.hasNext("[a-zA-Z]");
	}
	
	boolean nextCharIs(Scanner in, char c) {
		return in.hasNext(Pattern.quote(c+""));
	}
	
	char nextChar (Scanner in) {
		return in.next().charAt(0);
	}

	boolean checkLength ();
	
	
	void verifyInput (Scanner inputScanner) {
		
		inputScanner.useDelimiter(" ");
		
		if(!(nextCharIs(inputScanner, openParenthesis))) {      //check the first and last characters for {} and after trim the string
			out.printf("Missing '{'");
			start();
		}
		
		if(!(nextCharIsLetter(inputScanner))) {
			out.printf("Identifier must start with a letter");
			start();
		}
				
		while (inputScanner.hasNext()) {
			
			if(!((nextCharIsLetter(inputScanner)) || (nextCharIsDigit(inputScanner)))) {
				if()
				out.printf("Identifier can contain only numbers and letters");
				start();
			}
			
			
			
			String inputLine = in.nextLine();
			
			Scanner inputScanner = new Scanner(inputLine);
			
			verifyInput(inputScanner);
		}
		
		
		String name = studentScanner.next();
		
		String address = studentScanner.next();
		Scanner addressScanner = new Scanner(address);
		printAddress(addressScanner);
		}
	
	
	void start() {
		
		Scanner in = new Scanner(System.in);
		
		out.printf("Give the first set: ");
		
		
		while (in.hasNext()) {
			
			String inputLine = in.nextLine();
			
			Scanner inputScanner = new Scanner(inputLine);
			
			verifyInput(inputScanner);
		}
	}
	
		public static void main(String[] argv) {
		new Identifier().start();
		}
		}
}
