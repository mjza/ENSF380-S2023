/**
 * Example 3-1
 */
package ca.ucalgary.ensf380;

import java.util.Scanner;

/**
 * @author mahdi
 *
 */
public class Rectangle1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Creates a Scanner object
		Scanner scn = new Scanner(System.in);
		double x1, y1, x2, y2, x3, y3, x4, y4;
		// Reads x1
		System.out.print("X1:");
		x1 = scn.nextDouble();
		// Reads y1
		System.out.print("Y1:");
		y1 = scn.nextDouble();
		// Reads x2
		System.out.print("X2:");
		x2 = scn.nextDouble();
		// Reads y2
		System.out.print("Y2:");
		y2 = scn.nextDouble();
		// Reads x3
		System.out.print("X3:");
		x3 = scn.nextDouble();
		// Reads y3
		System.out.print("Y3:");
		y3 = scn.nextDouble();
		// Reads x4
		System.out.print("X4:");
		x4 = scn.nextDouble();
		// Reads y4
		System.out.print("Y4:");
		y4 = scn.nextDouble();
		// Detect the validity
		if(rectangle(x1, y1, x2, y2, x3, y3, x4, y4)) {
			System.out.println("Yes, this land is a rectangle.");
		} else {
			System.out.println("No, this land is not a rectangle.");
		}
	}
	
	/**
	 * Receives 4 coordinates and tells if they makes a perfect rectangle
	 * @param x1 A double value representing x1
	 * @param y1 A double value representing y1
	 * @param x2 A double value representing x2
	 * @param y2 A double value representing y2
	 * @param x3 A double value representing x3
	 * @param y3 A double value representing y3
	 * @param x4 A double value representing x4
	 * @param y4 A double value representing y4
	 * @return
	 */
	public static boolean rectangle(
			double x1, double y1, 
			double x2, double y2, 
			double x3, double y3, 
			double x4, double y4) {
		// Calculates each fractions
		double part1 = (x2 - x1) != 0 ? (y2 - y1) / (x2 - x1) : Double.POSITIVE_INFINITY;
		double part2 = (x3 - x4) != 0 ? (y3 - y4) / (x3 - x4) : Double.POSITIVE_INFINITY;
		double part3 = (x1 - x4) != 0 ? (y1 - y4) / (x1 - x4) : Double.POSITIVE_INFINITY;
		double part4 = (x2 - x3) != 0 ? (y2 - y3) / (x2 - x3) : Double.POSITIVE_INFINITY;
		// Compares both equations 
		boolean result = (part1 == part2) && (part3 == part4);
		return result;
	}

}
