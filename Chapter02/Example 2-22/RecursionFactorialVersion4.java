/**
 * Example 2-22
 */
package ca.ucalgary.ensf380;

/**
 * @author mahdi
 *
 */
public class RecursionFactorialVersion4 {

	/**
	 * Calculates the factorial of the input value
	 * 
	 * @param num Integer value that we want the factorial for it
	 * @return The calculated factorial
	 */
	public static int calculateFactorial(int num) {
		if(num < 0) {
			System.err.println("Factorial is not defined for negative numbers");
			return 0;
		}
		int product = 1;
		for (int i = 1; i <= num; i++) {
			product *= i;
		}
		return product;
	}

	/**
	 * Prints factorial of 10
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int result = calculateFactorial(-1);
		System.out.println(result);
	}
}
