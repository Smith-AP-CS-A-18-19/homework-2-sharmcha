/*
 * First and Last Names
 */

import java.awt.Rectangle;

public class Homework2 {

	/* Write the constructor for Homework2.
	 * It takes in one parameter: a String
	 * Save the string as a private instance variable
	 */
	private String hw2 = "Hello, World!";
	public Homework2(String world) {


	 /* Write the method uppercase
	 * It does not take in any parameters
	 * It returns a String
	 * Use String methods to turn the instance variable String into all
	 * uppercase letters and return the result
	 * Hint: Search the String class for 'uppercase'
	 */

		hw2.toUpperCase();

	/* Write the method strip
	 * It takes in one paramter: a String
	 * It returns a String
	 * Use String methods to remove punctuation from the parameter String
	 * It should remove spaces, commas, periods, and exclamation points.
	 * Hint: Search the String class for 'replace'
	 */

			hw2.replace("Hello, World!", "HELLOWORLD");

}
	/* Fix the errors in the method problem4
	 */
	public Rectangle problems() {
		Rectangle r1 = new Rectangle(5, 10, 15, 20);
		double width = Rectangle(5, 10, 15, 20).getWidth();
		Rectangle r2;
		r2.translate(15, 25);
		r3 = new Rectangle();
		r3.translate("Far, far away");
		return r3;
	}


	/* Use Rectangle methods to calculate and return the perimeter of the
	 * parameter Rectangle
	 */
	public double getPerimeter(Rectangle rect) {

	}
		int x = rect.getX();
		int y = rect.getY();
		int perimeter = 2*x + 2*y;
		return perimeter;
}
