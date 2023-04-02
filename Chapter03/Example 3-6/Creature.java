/**
 * Example 3-6
 */


/**
 * @author mahdi
 *
 */
public class Creature {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Animal myPet = new Animal("mouse");
		Animal myWildlife = new Animal("deer");

		System.out.println("I have a pet " + myPet.getAnimalType());
		System.out.println("I see a " + myWildlife.getAnimalType() + " outside");
	}
}

class Animal {
	private String animalType;

	public Animal(String arg) {
		animalType = arg;
	}

	public String getAnimalType() {
		return animalType;
	}
}
