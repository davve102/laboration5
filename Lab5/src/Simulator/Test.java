package Simulator;

/**
 * 
 * @author David Söderberg
 *
 */

public class Test {

	public static double f2c(double f) {
		double c;
		/**
		 * You can also code it like this
		 *     " c = java.lang.Math.rint((5 / 9 * (f - 32)) * 10.0d) / 10.0d; "
		 */
		c = 5.0 / 9.0 * (f - 32);
		c = java.lang.Math.rint(c * 10.0d) / 10.0d;
		return c;
	}
	
	public static void main(String[] args) {
		for(int i=40; i>=-40; i-=5) {
			System.out.println(i + "\u00b0F is " + f2c(i) + "\u00b0C");
		}
	}
}
