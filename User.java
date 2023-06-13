/*
 * Student Name: David Haley
 * Lab Professor: Professor David Haley
 * Due Date: The due date
 * Description: Assignment 02 (22W) Sample Solution  Update of original concept
 *              by Professor Stanley Pieda
 */

/* This class verifies that data entered is numeric where needed, trapping
 * the user inside an infinite loop until they enter the requested data.
 * Example use:
 * User user = new User();
 * int number1 = user.inputInteger("Enter a number: ");
 */

import java.util.Scanner;

/*
 * This class provides utility for getting user input from the console using
 * an instance of Scanner set to new Scanner(System.in)
 */
public class User {
	
	private Scanner keyboard = new Scanner(System.in);
	
	/*
	 * This method prompts the user using the argument sent to message
	 *  and then calls method inputInteger() to get the actual input value.
	 */
	public int inputInteger(String message) {
		// This method calls inputInteger(), so no changes are needed here.
		System.out.printf("%s", message);
		int value = inputInteger(); 
		return value;
	}

	/*
	 * This method prompts the user using the argument sent to message
	 *  and then calls method inputDouble() to get the actual input value.
	 */
	public double inputDouble(String message) {
		// This method calls inputDouble(), so no changes are needed here.
		System.out.printf("%s", message);
		double value = inputDouble();
		return value;
	}

	/*
	 * This method prompts the user using the argument sent to message, 
	 * then calls method inputString() which reads in the actual text.
	 */
	public String inputString(String message) {
		System.out.printf("%s", message);
		String value = inputString();
		return value;
	}

	/*
	 * Does not prompt the user, reads in an int value when there is one. If
	 * the user does not provide input that can be converted into an int an
	 * error message is printed requesting a correct input and a loop is used
	 * to trap the user until they get this right. A future version of 
	 * the program might have a sanity check to break the loop after several 
	 * failed attempts and then shut down the program, rather than looping
	 * (in theory) forever.
	 * private access modifier prohibits use of method from outside of the class
         * forcing the use of the method that accepts the String prompt in order
         * to get the value.
	 */
	private int inputInteger() {
		boolean isInputBad = true;
		boolean hasNextInt;
		int value = 0;
		while(isInputBad) {
			hasNextInt = keyboard.hasNextInt();
			if(hasNextInt) {
				value = keyboard.nextInt();
				isInputBad = false; // break out of loop
			}
			else {
				System.out.print("Invalid input. Enter an integer number: ");
			}
			keyboard.nextLine(); // clean up input stream
		}
		return value;
	}
	
	/*
	 * Does not prompt the user, reads in a double value when there is one. If
	 * the user does not provide input that can be converted into a double an
	 * error message is printed requesting a correct input and a loop is used
	 * to trap the user until they get this right. A future version of 
	 * the program might have a sanity check to break the loop after several 
	 * failed attempts and then shut down the program, rather than looping
	 * (in theory) forever.
	 * private access modifier prohibits use of method from outside of the class
         * forcing the use of the method that accepts the String prompt in order
         * to get the value. 
	 */
	private double inputDouble() {
		boolean isInputBad = true;
		boolean hasNextDouble;
		double value = 0.0;
		while(isInputBad) {
			hasNextDouble = keyboard.hasNextDouble();
			if(hasNextDouble) {
				value = keyboard.nextDouble();
				isInputBad = false; // break out of loop
			}
			else {
				System.out.print("Invalid input. Enter a number: ");
			}
			keyboard.nextLine(); // clean up input stream
		}
		return value;	
	}
	
	
	/*
	 * this method is used to get a line of text from the console, it reads
	 * until it encounters a line terminator character.
	 * private access modifier prohibits use of method from outside of the class
         * forcing the use of the method that accepts the String prompt in order
         * to get the value. 
	 */
	private String inputString() {
		String value = keyboard.nextLine();
		return value;
	}
	

}