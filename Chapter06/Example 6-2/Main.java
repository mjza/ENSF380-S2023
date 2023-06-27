/**
 * Example 6-2
 */
package edu.ucalgary.ensf409.example6_2;

/**
 * @author mansari
 *
 */
interface Animal { // In Java7 or earlier an interface method cannot have a body
    public void animalSound(); 
    public void sleep();
} // End of interface

class Pig implements Animal {
    public void animalSound() {
        System.out.println("Wee, wee, wee");
    }
    public void sleep() {
        System.out.println("Zzz, zzz, zzz");
    }
}
public class Main {
  public static void main(String[] args) {
    Pig pig = new Pig(); 
    pig.animalSound();
    pig.sleep();
  }
}
