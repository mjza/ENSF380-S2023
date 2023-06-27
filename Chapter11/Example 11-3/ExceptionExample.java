/*
Copyright Ann Barcomb and Emily Marasco, 2021
Licensed under GPL v3
See LICENSE.txt for more information.
*/
package edu.ucalgary.ensf409;

public class ExceptionExample {

	static public void main (String[] args) {
		var example = new ExceptionExample();	
		Integer answer = null;

		try {
			answer = example.divide(5, 0);	

		}

		catch(ArithmeticException e) {
			System.out.println("Caught an arithmetic error " + e.getMessage());
		}

		System.out.println("Answer was: " + answer);
	}


	public int divide(int number, int divisor) {
		int answer = number / divisor;	
		return answer;
	}
}

