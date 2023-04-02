/**
 * Example 2-12
 */
package ca.ucalgary.ensf380;
import java.util.Scanner;

/**
 * @author mahdi
 *
 */
public class Break {
	/**
	 * It reads user's inputs and prints their avg 
	 * @param args
	 */
	public static void main(String[] args) {    
	    Scanner scn = new Scanner(System.in);  // Creates a Scanner object
	    System.out.println("Please enter maximum 5 positive integer values.");
	    System.out.println("To stop procedure, enter zero or a negative value.");
	    int sum = 0, counter, val;
	    for(counter = 0; counter < 5; ) {
	    	System.out.print("Enter #" + (counter + 1) + " value: ");
	    	val = scn.nextInt();  // Reads input
	    	if(val > 0) {
	    		sum += val;
	    		++counter;
	    	} 
	    	else 
	    		break;
	    }
	    scn.close(); // Releases the resource
	    // Calculates the avg value if number of elements is more than 0!
	    double avg = counter > 0 ? sum / counter : -1d;
	 	if(avg > 0)
	 		System.out.println("The average is: " + avg);
	 	else
	 		System.out.println("You entered no value.");
	}
}
