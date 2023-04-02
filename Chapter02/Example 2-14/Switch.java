/**
 * Example 2-14
 */
package ca.ucalgary.ensf380;
/**
 * @author mahdi
 *
 */
public class Switch {
	/**
	 * Prints day name for a random generated value
	 * @param args
	 */
	public static void main(String[] args) {
		int day = (int)(Math.random() * 10); // random value in [0,10)
		switch (day) {
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");	
			break;
		default:
			System.out.println("Invalid day number: " + day);
		}
	}
}
