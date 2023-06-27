/**
 * 
 */
package edu.ucalgary.ensf409;

/**
 * @author mansari
 *
 */
enum CourseLevel {
	BEGGINER,
	INTERMEDIATE,
	ADVANCED
}
public class EnumFirstExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CourseLevel myLevel = CourseLevel.INTERMEDIATE;
		
		switch(myLevel) {
	      case BEGGINER:
	        System.out.println("Low level");
	        break;
	      case INTERMEDIATE:
	         System.out.println("Medium level");
	        break;
	      case ADVANCED:
	        System.out.println("High level");
	        break;
	    }

	}

}
