/*
Copyright Ann Barcomb and Emily Marasco, 2021
Licensed under GPL v3
See LICENSE.txt for more information.
*/
package edu.ucalgary.ensf409;

import java.util.*;

// Demonstration of using MyList generic 
public class SimpleArrays {
	public static void main(String[] args) {
		Integer one = 1;
		String hi = "Hi";

		MyList<Integer> integerMyList = new MyList<Integer>(one);
		MyList<String> stringMyList = new MyList<String>(hi);
		MyList<String> defaultMyList = new MyList<String>();

		System.out.println("Integer concatenateArray(1): " + integerMyList.concatenateArray(1));
		System.out.println("String concatenateArray(): " + stringMyList.concatenateArray());
		System.out.println("Default concatenateArray(2): " + defaultMyList.concatenateArray(2));

		System.out.println("Integer cropArray(3, 2): " + integerMyList.cropArray(3, 2));
		System.out.println("String cropArray(0, 4): " + stringMyList.cropArray(0, 4));
		System.out.println("Default concatenateArray(0, 0): " + defaultMyList.cropArray(0, 0));
	}
}

/*
  Some notes on the implementation: In Java, you would rarely opt to extend collections.
  This implementation is designed to show several different aspects of generics.
  The constructor which takes no arguments triggers the use of the static String ArrayList.
  The constructor which takes arguments relies on using the super for storage.
  Thus, each method must be prepared to operate on either the static variable or on this.

  The zero argument version of concatenateArray could have simply checked if the index was in
  bounds and called cropArray, similar to how the one-argument version of concatenateArray
  does. I opted to provide a distinct implementation of concatenateArray in order to show use
  of a generic variable (iterator). This is for illustration purposes only and is not good
  style.

  This implementation depends on every object type which is used implementing toString().
*/


// Example generic which implements exercise 4.1
class MyList<E> extends ArrayList<E> {
	// TODO: Write your code here
}
