/**
 * Example 3-5
 */
package ca.ucalgary.ensf380.examples;

/**
 * @author mahdi
 *
 */
public class StaticMembers {

	/**
	 * Demonstrates the static members
	 * @param args
	 */
	public static void main(String[] args) {
		double radius = 8.2;
		System.out.println("The circle radius is: " + radius);
		System.out.println("The circle area is: " + getArea(radius));
		System.out.println("The circle perimeter is: " + Circle.getPerimeter(radius));
	}
	/**
	 * Calculates the area of a circle for a given radius
	 * @param r double variable as the circle radius
	 * @return the area of the circle
	 */
	public static double getArea(double r) {
		return Circle.PI_NUM * r * r;
	}
}

class Circle {
	// static variables are accessible with class name
	static double PI_NUM = 3.14;
	
	/**
	 * Calculates the perimeter of a circle for a given radius
	 * @param radius double variable as the circle radius
	 * @return the perimeter of the circle
	 */
	public static double getPerimeter(double radius) {
		return 2 * PI_NUM * radius;
	}

}
