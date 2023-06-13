/*
 * Student Name: David Haley
 * Lab Professor: Professor David Haley
 * Due Date: The due date
 * Description: Assignment 02 (23W) Sample Solution - Update of original concept
 *              by Professor Stanley Pieda
 */

/* This class models dimensional lumber with fields for thickness, width,
 * length all in inches. Note that a typical marketing for lumber would be 
 * 2x6x16 meaning 2-inches by 6-inches by 16 feet, however the expected 
 * measured dimensions would be 1.5 inches thick, by 5.5 inches wide, 
 * by 192 inches long. Constants are provided to map common feet-lengths
 * to inches
 */
public class DimensionalLumber {
	// 12 inches per foot, so e.g. 16-feet times 12 inches is 192 inches.
	// 2"x6"x16'  ("is inches, 'is feet)
	public static final double EXPECTED_THICKNESS = 1.5;
	public static final double EXPECTED_WIDTH = 5.5;
	public static final double EXPECTED_LENGTH = 192.0; 
	private double thickness; // Measured thickness in inches
	private double width; // Measured width in inches
	private double length; // Measured length in inches

	/*
	 * No-argument constructor, sets dimensions to 1.5 x 5.5 x 192.0 for
	 * common lumber size. i.e. 2"x4"x16'
	 */
	public DimensionalLumber() {
		this(EXPECTED_THICKNESS, EXPECTED_WIDTH, EXPECTED_LENGTH); 
	}
	
	/*
	 * Overloaded constructor, sets dimensions as specified. The parameters
	 * are ordered from left to right as 
	 * (double thickness, double width, double length)
	 */
	public DimensionalLumber(double thickness, double width, double length) {
		this.thickness = thickness;
		this.width = width;
		this.length = length;
	}

	/*
	 * Accessor for thickness, uses inches as unit of measure
	 */
	public double getThickness() {
		return thickness;
	}

	/*
	 * Mutator for thickness, uses inches as unit of measure
	 */
	public void setThickness(double thickness) {
		this.thickness = thickness;
	}

	/*
	 * Accessor for width, uses inches as unit of measure
	 */
	public double getWidth() {
		return width;
	}

	/*
	 * Mutator for width, uses inches as unit of measure
	 */
	public void setWidth(double width) {
		this.width = width;
	}	
	
	/*
	 * Accessor for length, uses inches as unit of measure
	 */
	public double getLength() {
		return length;
	}

	/*
	 * Mutator for length, uses inches as unit of measure
	 */
	public void setLength(double length) {
		this.length = length;
	}
	
	/*
	 * Returns a String that represents the data held within this object.
	 */
	public String toString() {
		String formatString;
		String result;
		
		formatString = "%s: thickness %.5f, width %.5f, length %.5f";
	    result = String.format(formatString, 
				"Dimensional Lumber", thickness, width, length);
	    
		return result;
	}
	
	

}
