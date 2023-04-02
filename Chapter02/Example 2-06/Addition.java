/**
 * Example 2-6
 * @author Mahdi J.Ansari<a href="mailto:mahdi.ansari@ucalgary.ca">mahdi.ansari@ucalgary.ca</a>
 * @version 1.0
 * @since 1.0
 * @license MIT
 */
public class Addition {

	/**
	 * @param args Arbitrary args list
	 */
	public static void main(String[] args) {
		// initializing variables
        int num1 = 20, num2 = 10, sum = 0;
        
        // Displaying num1 and num2
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
  
        // Calls add function to calculate sum 
        sum = add(num1, num2);
        System.out.println("The sum = " + sum);
	}
	
	/**
	 * Calculates sum of two input values. 
	 * @param num1 The first input value
	 * @param num2 The second input value
	 * @return Sum of the two input values.
	 */
	public static int add(int num1, int num2) {
		// adding num1 and num2
		int sum = num1 + num2;
		return sum;
	}

}
