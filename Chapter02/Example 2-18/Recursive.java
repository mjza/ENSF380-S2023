/**
 * Example 2-18
 */
package ca.ucalgary.ensf380;
import java.util.Scanner;
/**
 * @author mahdi
 *
 */
public class Recursive {

	/**
	 * It counts down numbers from an input n
	 * @param args
	 */
	public static void main(String[] args) {		
		Scanner scn = new Scanner(System.in); // Creates a Scanner object
		System.out.println("This program counts down from n to 1.");
	    
		System.out.print("Please enter an integer as the start value: ");
	    int start = scn.nextInt(); // Reads the input value
	    countDown(start);
	    scn.close(); // Releases the input resource
	}
	
	/**
	 * It prints numbers from n to 1
	 * @param n The start value
	 */
	public static void countDown(int n) {
	    if (n == 0) {
	        System.out.println("Blastoff!");
	    } else {
	        System.out.println(n);
	        countDown(n - 1); // Recursive call
	    }
	}
}
