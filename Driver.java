/**
 * Program: Driver for PalindromicPrime
 * File: Driver.java
 * Program reads test if an integer between 1 - 100,000 is prime or palindromic.
 * Integers are passed to each method for testing.
 * Author: Jason E. Borum 
 * Date: December 24, 2017
 **/
public class Driver {
	public static void main(String[] args) { //Beginning of main method
		int integerMax = 100000; // set max integer
		PalindromicPrime number = new PalindromicPrime(); // Create new number object
		
		for (int i = 1; i <= integerMax; i++) { // Enter for loop
			if ((number.isPalindromic(i) == true) || (number.isPrime(i) == true)) // Test value with isPalondromic and isPrime Method
			System.out.println(i); // Print value to screen
	  }	// End of for loop
	} //End of main method
} //End of Driver Class
