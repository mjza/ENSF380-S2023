/**
 * Example 2-20
 */
package ca.ucalgary.ensf380;

/**
 * @author mahdi
 *
 */
public class RecursionFactorialVersion2 {
	
	/**
	 * Calculates the factorial of the input value
	 * @param num Integer value that we want the factorial for it
	 * @return The calculated factorial
	 */
	public static int calculateFactorial(int num) {
		System.out.println("Call for factorial(" + num + ")");
		if (num > 1) {
			int result = calculateFactorial(num - 1);
			int factorial = num * result;
			System.out.println(num + " * facturial(" + (num-1) + ") = " 
			+ num + " * " + result + " = " + factorial);
			return num * result;
		} else {
			System.out.println("factorial(1) = 1");
			return 1;
		}
	}

	/**
	 * Prints factorial of 10
	 * @param args
	 */
	public static void main(String[] args) {
		int result = calculateFactorial(5);
		System.out.println(result);
	}
}
