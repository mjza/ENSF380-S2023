/**
 * Example 2-02
 * @author Mahdi J.Ansari<a href="mailto:mahdi.ansari@ucalgary.ca">mahdi.ansari@ucalgary.ca</a>
 * @version 2.3
 * @since 2.0
 * @license MIT
 */
package ca.ucalgary.ensf380;

/**
 * A class that illustrates arithmetic operators
 */
public class Arithmetic {
	/**
	 * Utilizes arithmetic operators and illustrates their functionalities
	 * @param args
	 */
	public static void main(String[] args)
    {
        // initializing variables
        int num1 = 20, num2 = 10, sum, sub, mul, div, mod;
  
        // Displaying num1 and num2
        System.out.println("num1 = " + num1 + " and num2 = " + num2);
 
        sum = num1 + num2;  // Adding num1 and num2          (sum = 30)
        sub = num1 - num2;  // subtracting num1 and num2     (sub = 10)
        mul = num1 * num2;  // Multiplying num1 and num2     (mul = 200)
        div = num1 / num2;  // Dividing num1 and num2        (div = 2)
        mod = num1 % num2;  // Remaindering num1 and num2    (mod = 0)

        System.out.print("+: " + sum + ", -: " + sub + ", *: " + mul);
        System.out.println(", /: " + div + ", %: " + mod);
    }
}