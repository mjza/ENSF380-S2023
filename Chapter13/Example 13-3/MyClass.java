/*
Copyright Ann Barcomb and Emily Marasco, 2021
Licensed under GPL v3
See LICENSE.txt for more information.
*/
package edu.ucalgary.ensf409;

import java.io.*;

public class MyClass {
    public static void main(String[] args) throws Exception {
	var out = new PrintWriter(System.out, true); // Writes in console instead of a file
	out.write("Manual flush."); // The write() method does not auto flush.  
	Thread.sleep(2000); // Pauses the thread for some milliseconds before continuing
	out.flush();

	out.println();
	out.printf("My cat is %d years old.", 11);
	out.println(); // The println() method causes the buffer to be flushed
	Thread.sleep(2000); // Demonstrates the buffer functionality
	out.close();
    }
}

