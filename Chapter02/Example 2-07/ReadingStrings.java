/**
 * Example 2-7
 */
package ca.ucalgary.ensf380;
import java.util.Scanner;
/**
 * @author mahdi
 *
 */
public class ReadingStrings {
	/**
	 * It reads user's name and prints a greeting message 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);  // Creates a Scanner object
	    System.out.print("Please enter your first name: ");

	    String name = scn.nextLine();  // Reads input
	    System.out.println("Hello " + name);  // Prints the greeting message

	}
}
