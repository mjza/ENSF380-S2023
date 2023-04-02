/**
 * Example 2-5
 * @author Mahdi J.Ansari<a href="mailto:mahdi.ansari@ucalgary.ca">mahdi.ansari@ucalgary.ca</a>
 * @version 1.0
 * @since 1.0
 * @license MIT
 */
package ca.ucalgary.ensf380;

/**
 * A class that illustrates logical shift right operator
 */
public class LogicalShiftRight {
	public static void main(String[] args) {
		int x = -2147483648, y;
		// Displays x 
		System.out.println("x= (" + String.format("%32s", Integer.toBinaryString(x)).replaceAll(" ", "0") + ")2= " + x);
		// Displays result of shift right operations
		y = x >>> 0;
		System.out.println("(x >>> 0)= (" + String.format("%32s", Integer.toBinaryString(y)).replaceAll(" ", "0") + ")2= " + y);
		y = x >>> 1;
		System.out.println("(x >>> 1)= (" + String.format("%32s", Integer.toBinaryString(y)).replaceAll(" ", "0") + ")2= " + y);
		y = x >>> 29;
		System.out.println("(x >>> 29)= (" + String.format("%32s", Integer.toBinaryString(y)).replaceAll(" ", "0") + ")2= " + y);
		y = x >>> 30;
		System.out.println("(x >>> 30)= (" + String.format("%32s", Integer.toBinaryString(y)).replaceAll(" ", "0") + ")2= " + y);
		y = x >>> 31;
		System.out.println("(x >>> 31)= (" + String.format("%32s", Integer.toBinaryString(y)).replaceAll(" ", "0") + ")2= " + y);
		y = x >>> 32;
		System.out.println("(x >>> 32)= (" + String.format("%32s", Integer.toBinaryString(y)).replaceAll(" ", "0") + ")2= " + y);
		y = x >>> 33;
		System.out.println("(x >>> 33)= (" + String.format("%32s", Integer.toBinaryString(y)).replaceAll(" ", "0") + ")2= " + y);
	}
}
