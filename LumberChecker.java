/*
 * Student Name: Jingnan Xiao
 * Lab Professor: Professor Mel Sanschagrin
 * Due Date: March 31 at 11:59 PM
 * Modified: March 29, 2023.
 * Description: Lab Assignment 02, Task 4 Demo file
 */


/* Description: This class checks whether a lumber is within the tolerance range
 * and reports the result.
 */
public class LumberChecker {
	// a public static final EPSILON with value 0.03125 
	// i.e.1/32 one-thirty-second inch
	public static final double EPSILON = 0.03125;
	
	/* Description: check the 3 dimensions of a lumber.
	 * If all 3 dimensions are within the tolerance, report the lumber is within the range.
	 * Otherwise, report the dimensions that are not in range.
	 */
	public String validate(DimensionalLumber lumber) {	
		String exceededDimensionReport = "Lumber dimensions are not within tolerance.\n";		
		
		// If any of the dimensions are negative report
		// that the lumber could not be verified due to negative dimensions.
		if (lumber.getThickness() <0 || lumber.getThickness() <0 || lumber.getThickness() <0) {
			return "Negative dimension entered, lumber cannot be verified. ";
		}
		
		// return a String that reports if the lumber meets the specifications
		if (Math.abs(lumber.getThickness() - lumber.EXPECTED_THICKNESS) <= EPSILON // check that the thickness does not differ more than EPSILON and 1.5 inches	
				&& Math.abs(lumber.getWidth() - lumber.EXPECTED_WIDTH) <= EPSILON // check that the width does not differ more than EPSILON and 5.5 inches
				&& Math.abs(lumber.getLength() - lumber.EXPECTED_LENGTH) <= EPSILON)// check that the length does not differ more than EPSILON and 192 inches
		{
			return "Lumber dimensions meet tolerance standards of 0.03125 inches.";
		}
		
		// or if it does not, what dimension(s) are incorrect.
		if (Math.abs(lumber.getThickness() - lumber.EXPECTED_THICKNESS) > EPSILON) {
			double difference = Math.abs(lumber.getThickness() - lumber.EXPECTED_THICKNESS );
			String formattedDiff = String.format("%.5f", difference);
			exceededDimensionReport += "Thickness exceeds tolerance of " + formattedDiff + " inches.\n";
		}
		
		if (Math.abs(lumber.getWidth() - lumber.EXPECTED_WIDTH) > EPSILON) {
			double difference = Math.abs(lumber.getWidth() - lumber.EXPECTED_WIDTH);
			String formattedDiff = String.format("%.5f", difference);
			exceededDimensionReport += "Width exceeds tolerance of " + formattedDiff + " inches.\n";
		}
		
		if (Math.abs(lumber.getLength() - lumber.EXPECTED_LENGTH) > EPSILON) {
			double difference = Math.abs(lumber.getLength() - lumber.EXPECTED_LENGTH);
			String formattedDiff = String.format("%.5f", difference);
			exceededDimensionReport += "Length exceeds tolerance of " + formattedDiff + " inches.\n";
		}		
		return exceededDimensionReport;
	}
}
