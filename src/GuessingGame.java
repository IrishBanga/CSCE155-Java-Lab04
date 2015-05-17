/**
 * CSCE 155 Lab Looping - Java Version
 * 
 * GuessingGame.java
 * A program to play a game with the computer.  A random number between 
 * 1 and 1000 is generated, and the user must guess what it is.
 */

import java.util.Random;

public class GuessingGame {
	
	public static void main( String[] args ){
		
		int n = 1000;
		
		Random randomNumber = new Random();
		int secretNumber;
		secretNumber = 1 + randomNumber.nextInt( n );
		
		int guess = -10;
		int numGuesses = 0;
		
		System.out.println( "Welcome to Guess-A-Number Game!" );
		System.out.println( "Enter a number between 1 and " + n );
		
		// TODO: place your code here
		
		
		
		System.out.println( "Congratulations, you found it!" );
		System.out.printf( "You guessed %d times!\n", numGuesses );
		
	}

}
