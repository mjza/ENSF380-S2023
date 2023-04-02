/**
 * Example 2-19
 */
package ca.ucalgary.ensf380;

/**
 * @author mahdi
 *
 */
public class RecursionFactorial {
	
	/**
	 * Calculates the factorial of the input value
	 * @param num Integer value that we want the factorial for it
	 * @return The calculated factorial
	 */
	public static int calculateFactorial(int num) {
		if (num > 1) {
			return num * calculateFactorial(num - 1);
		} else {
			return 1;
		}
	}

	/**
	 * Prints factorial of 10
	 * @param args
	 */
	public static void main(String[] args) {
		int result = calculateFactorial(10);
		System.out.println(result);
	}
}
