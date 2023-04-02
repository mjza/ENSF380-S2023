/**
 * Example 2-13
 */
package ca.ucalgary.ensf380;

/**
 * @author mahdi
 *
 */
public class Continue {
	/**
	 * It prints 0,5,10,15,20 as multiples of 5 between 0 and 20.
	 * @param args
	 */
	public static void main(String[] args) {    
	    System.out.println("The program prints all multiples of 5 in [0,20].");
	    boolean flag = true; // First element flag
	    for(int i = 0; i <= 20; i++) {
	    	if( i % 5 != 0)
	    		continue;
	    	if(flag) 
	    		flag = !flag;
	    	else
	    		System.out.print(",");
	    	System.out.print(i);	    	
	    }
	}
}
