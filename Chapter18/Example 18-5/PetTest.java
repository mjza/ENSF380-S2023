/*
Copyright Ann Barcomb and Emily Marasco, 2023
Licensed under GPL v3
See LICENSE.txt for more information.
*/

// In the video, a different package name may be shown. The correct
// package name for this course is edu.ucalgary.oop.
package edu.ucalgary.oop;

import org.junit.*;
import static org.junit.Assert.*;

public class PetTest {
    
    public PetTest() {
    }
    
    @Test
    public void testCalculateAge_BirthdayPast() {
        
        int[] birthDate = new int[]{2011,1,1};
        
        Pet petDog = new Pet("Pongo", "Dog", "Dalmatian", 4, "Spotted", "Fur", birthDate);
        
        System.out.println("calculateAge");
        int expResult = 13;
        int result = petDog.calculateAge();
        assertEquals("Calculated age was incorrect: ", expResult, result);
    }


    @Test
    public void testCalculateAge_BirthdayFuture() {
        
        int[] birthDate = new int[]{2011,7,30};
        
        Pet petDog = new Pet("Pongo", "Dog", "Dalmatian", 4, "Spotted", "Fur", birthDate);
        
        System.out.println("calculateAge");
        int expResult = 12;
        int result = petDog.calculateAge();
        assertEquals("Calculated age was incorrect: ", expResult, result);
    }

    @Test
    public void testCalculateAge_BirthdayToday() {
        
        int[] birthDate = new int[]{2011,2,17};
        
        Pet petDog = new Pet("Pongo", "Dog", "Dalmatian", 4, "Spotted", "Fur", birthDate);
        
        System.out.println("calculateAge");
        int expResult = 13;
        int result = petDog.calculateAge();
        assertEquals("Calculated age was incorrect: ", expResult, result);
    }

    @Test
    public void testCalculateAge_BirthdayFuture2() {
        
        int[] birthDate = new int[]{2011,7,1};
        
        Pet petDog = new Pet("Pongo", "Dog", "Dalmatian", 4, "Spotted", "Fur", birthDate);
        
        System.out.println("calculateAge");
        int expResult = 13;
        int result = petDog.calculateAge();
        assertEquals("Calculated age was incorrect: ", expResult, result);
    }	

    @Test(expected=IllegalArgumentException.class)
    public void testCalculateAge_BirthdayException() {
        
        int[] birthDate = new int[]{2030,7,1};

        Pet petDog = new Pet("Pongo", "Dog", "Dalmatian", 4, "Spotted", "Fur", birthDate);
    }	
}

