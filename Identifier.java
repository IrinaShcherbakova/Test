package assignment1;

import java.util.Scanner;

public class Identifier implements IdentifierInterface {
	
	Identifier();
	
	Identifier(Identifier src);
	
	
	boolean nextCharIsDigit (Scanner in);
	
	boolean nextCharIsLetter (Scanner in);
	
	boolean nextCharIs(Scanner in, char c);
	
	char nextChar (Scanner in);

	boolean checkLength ();
}
