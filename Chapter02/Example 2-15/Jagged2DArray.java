/**
 * Example 2-15
 */
package ca.ucalgary.ensf380;

/**
 * @author mahdi
 *
 */
public class Jagged2DArray {

	/**
	 * It prints a jagged 2D array
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int[][] mat = { 
						{ 1, 2, 3, 4 }, // First row elements 
						{ 5, 6, 7 } // Second row elements
					  };
		System.out.println("Your matrix elements are: ");
		for (int i = 0; i < mat.length; ++i) {
			for (int j = 0; j < mat[i].length; ++j) {
				System.out.print(mat[i][j]);
				if (j < mat[i].length - 1)
					System.out.print(", ");
			}
			System.out.print("\n");
		}
	}
}
