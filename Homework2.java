/*
 * Charvi Sharma
 */

import java.awt.Rectangle;

public class Homework2 {

	/* Write the constructor for Homework2.
	 * It takes in one parameter: a String
	 * Save the string as a private instance variable
	 */
	private String phrase;
	public Homework2(String parameter) {
			phrase = parameter;
	}
	 /* Write the method uppercase
	 * It does not take in any parameters
	 * It returns a String
	 * Use String methods to turn the instance variable String into all
	 * uppercase letters and return the result
	 * Hint: Search the String class for 'uppercase'
	 */
	 public String uppercase(){
		 phrase = phrase.toUpperCase();
		 return phrase;
	 }

	/* Write the method strip
	 * It takes in one paramter: a String
	 * It returns a String
	 * Use String methods to remove punctuation from the parameter String
	 * It should remove spaces, commas, periods, and exclamation points.
	 * Hint: Search the String class for 'replace'
	 */
	 public String strip(String hi){
		 hi = phrase.replace(" ", "");
		 hi = phrase.replace(",", "");
		 hi = phrase.replace(".", "");
		 hi = phrase.replace("!", "");
		 return hi;

	 }
	/* Fix the errors in the method problem4
	 */
	public Rectangle problems() {
		Rectangle r1 = new Rectangle(5, 10, 15, 20);
		double width = r1.getWidth();
		Rectangle r2 = new Rectangle(1,2,3,4);
		r2.translate(15, 25);
		Rectangle r3 = new Rectangle(2,3,4,5);
		r3.translate(10,2);
		return r3;
	}


	/* Use Rectangle methods to calculate and return the perimeter of the
	 * parameter Rectangle
	 */
	public double getPerimeter(Rectangle rect) {
		double width = rect.getWidth();
		double height = rect.getHeight();
		double perimeter = 2*width + 2*height;
		return perimeter;
	}
}
