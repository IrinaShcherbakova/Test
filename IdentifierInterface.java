package assignment1;

import java.util.Scanner;

public interface IdentifierInterface {
	

	/*
	 *
	 * Elements: identifiers of the type Identifier
	 * Structure: linear
	 * Domain: alphanumeric characters with a length >= 1 beginning with a letter
	 *
	 * constructors
	 *
	 * Identifier();
	 *   PRE  - 
	 *   POST -A new Identifier-object has been made and contains the empty identifier.
	 *
	 * Identifier (Identifier src);
	 *   PRE  - 
	 *   POST - A new Identifier-object has been made and contains a copy of src.
	 *
	 */
	
	boolean nextCharIsDigit (Scanner in);
	
	boolean nextCharIsLetter (Scanner in);
	
	boolean nextCharIs(Scanner in, char c);
	
	char nextChar (Scanner in);

	boolean checkLength ();
}
