/*
 * Student Name: Jingnan Xiao
 * Lab Professor: Professor Mel Sanschagrin
 * Due Date: March 31 at 11:59 PM
 * Modified: March 29, 2023.
 * Description: Lab Assignment 02, Task 4 Demo file
 */

import java.util.Scanner;


/* Description: this class for quality control the company samples the dimensions
 * of the surfaced dry lumber at intervals, to ensure that the width, thickness, 
 * and length are within 1/32 of an inch (i.e. 0.03125 inclusive) of the 
 * expected dimensions. 
 */
public class Assignment02 {

	/* Description: asks users to enter the length, thickness, 
	 * and width of a lumber in inches, and then determine if the lumber is within
	 * tolerance, or if not report what dimension(s) are out of tolerance.
	 */
	public static void main(String[] args) {
		LumberChecker lumberChecker = new LumberChecker();
		User user = new User();
		// (other variables as needed)		
		Double thickness, width, length;
		String continueFlag = "";
		String name = "Jingnan Xiao";
		Scanner keyboard = new Scanner(System.in);
		DimensionalLumber lumber = new DimensionalLumber();
		
		// Prompt the user to enter the thickness, width, and length as measured for a sample of dimensional lumber
		// using a loop ask if there is more data to enter (yes, no) and continue
		// only if the user enters some form of yes
		// e.g. "YES" "yEs" "yeS" would be acceptable (any capitalization)
		// if yes, processing should repeat in outputting the menu as above.
		do {
			System.out.println("Enter dimensions for lumber.");
			System.out.println("Expected values for dimensions are ");
			System.out.println("1.50 for thickness, 5.50 for width, 192.00 for length");
			thickness = user.inputDouble("Enter measured thickness (inches): ");
			width = user.inputDouble("Enter measured width (inches): ");
			length = user.inputDouble("Enter measured length (inches): ");

			// set the dimensions into an instance of DimensionalLumber
			lumber.setThickness(thickness);
			lumber.setWidth(width);
			lumber.setLength(length);
			
			// use the toString method of class DimensionalLumber
			// to output the information for the lumber. 
			System.out.println(lumber.toString());
			
		
			// Use the LumberChecker method to obtain a report regarding if the
			// lumber is within specifications for thickness, width, length
			// by passing the DimensionalLumber reference-value as an argument.
			// (See Sample Program Run for report format)
			System.out.println(lumberChecker.validate(lumber));
			
			
			// print out your name on screen
			System.out.println("Program by " + name);
			continueFlag = user.inputString("Continue Program? (Yes / no) ");
			while (!continueFlag.equalsIgnoreCase("yes") && !continueFlag.equalsIgnoreCase("no")) {
		        System.out.println("Invalid input. Please enter Yes or no.");
		        continueFlag = user.inputString("Continue Program? (Yes / no) ");
		    }			
		} while (continueFlag.equalsIgnoreCase("yes"));
		
		System.out.println("Program will now shut down.");
	}
}