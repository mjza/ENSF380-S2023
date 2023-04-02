/**
 * Example 2-16
 */
package ca.ucalgary.ensf380;
/**
 * @author mansari
 *
 */
public class Creature {

	/**
	 * @param args Handles a single command-line argument
	 */
	public static void main(String[] args) {
		if (args.length == 0) {
			throw new IllegalArgumentException("You must supply a command-line argument");
		} else {
			System.out.println("This is a placeholder for Creature " + args[0]);
		}
	}
}
