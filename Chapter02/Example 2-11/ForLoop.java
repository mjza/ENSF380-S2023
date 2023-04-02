/**
 * Example 2-11
 */
package ca.ucalgary.ensf380;
/**
 * @author mahdi
 *
 */
public class ForLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("This program calculates average of five values.");
		// Creates an array
		int[] arr = {10, 23, 57, 42, 85};
		int sum = 0;
		// Iterates over array elements
		for(int i= arr.length -1; i >= 0 ; i--) {
			sum += arr[i];
			System.out.println("The value #" + (i+1) + " is: " + arr[i]);
		}
		// Calculates the avg value if number of elements is more than 0!
		double avg = arr.length > 0 ? sum / arr.length : -1d;
		System.out.println("The average is: " + avg);	

	}

}
