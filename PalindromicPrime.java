/**
 * Program: PalindromicPrime
 * File: PalindromicPrime.java
 * The class contains two methods to test if an integer is prime or palindromic.
 * Each method returns a boolean.
 * Author: Jason E. Borum 
 * Date: December 24, 2017
 **/

public class PalindromicPrime { // Beginning of PalindromicPrime Class

//Testing for Prime Number
public boolean isPrime(int intValue){ // Beginning of isPrime method
	boolean result = true; // Set the default result to true
	if (intValue != 1) { // Enter if statement if the integer is not equal to 1
	  for (int i = 2; i < intValue / 2; i++){ //Enter loop and skip even numbers
	     if (intValue % i == 0){ // if the remainder is equal to zero set result to false
	       result = false;
	     } // End of if statement
	  } // End of for loop
	} // end of if statement
	return result; // Return the value of result
} // end of isPrime method

//Testing for Palindromic Number
public boolean isPalindromic(int intValue) { //Beginning of isPalindromic method
    int intTest = intValue; // set intTest equal to the integer being tested
    int intReverse = 0; // set inReverse to zero
    int intRemainder; // Initialize intRemainder.
    while(intValue > 0) { // begin while loop to rearrange value
      intRemainder = intValue % 10; //
      intReverse = intReverse * 10 + intRemainder; 
      intValue = intValue / 10; 
    }  // end of while loop
    if(intReverse == intTest) 
      return true; // return true if integer is palindromic
    else 
      return false; // return false if integer is not palindromic
  } // end of isPalindromic method
} // end of PalindromicPrime Class
