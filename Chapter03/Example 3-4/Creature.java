/**
 * Example 3-4
 */
package ca.ucalgary.ensf380.examples;

/**
 * @author mahdi
 *
 */
public class Creature {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Animal myPet = new Animal();
		myPet.setAnimalType("mouse");
		Animal myWildlife = new Animal();
		myWildlife.setAnimalType("deer");

		System.out.println("I have a pet " + myPet.getAnimalType());
		System.out.println("I see a " + myWildlife.getAnimalType() + " outside");
	}
}

class Animal {
	private String animalType;

	public void setAnimalType(String arg) {
		animalType = arg;
	}

	public String getAnimalType() {
		return animalType;
	}
}
