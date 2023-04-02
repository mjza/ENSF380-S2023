/**
 * Example 3-6
 */

/**
 * @author mahdi
 *
 */
public class FinalMembers {

	/**
	 * Demonstrates the static members
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Circle circle = new Circle(8.2);
		System.out.println("The circle radius is: " + circle.radius);
		System.out.println("The circle area is: " + getArea(circle.radius));
		System.out.println("The circle perimeter is: " + circle.getPerimeter());
		// circle.radius++; // Error: The final field cannot be assigned
	}
	public static double getArea(double r) {
		return Circle.PI_NUM * r * r;
	}
}

class Circle {
	// static variables are accessible with class name
	public final static double PI_NUM = 3.14;
	public final double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	/**
	 * Calculates the perimeter of a circle for a given radius
	 * 
	 * @param radius double variable as the circle radius
	 * @return the perimeter of the circle
	 */
	public double getPerimeter() {
		return 2 * PI_NUM * radius;
	}
}
