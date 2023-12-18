package unl.soc;

import java.util.Random;
import java.util.Scanner;

/**
 * Author: Irish Banga
 * Date: 2023/12/18
 *
 * A program to play a game with the computer. A random number between 1 and
 * 1000 is generated, and the user must guess what it is.
 * 
 */
public class GuessingGame {

	public static void main(String[] args) {

		int n = 1000;

		Random randomNumber = new Random();
		int secretNumber;
		secretNumber = 1 + randomNumber.nextInt(n);

		int guess = -10;
		int numGuesses = 0;

		System.out.println("Welcome to Guess-A-Number Game!");
		System.out.println("Enter a number between 1 and " + n);

		Scanner in=new Scanner(System.in);
		
		do {
			guess = in.nextInt();
			if (guess != secretNumber) {
				System.out.println("Your guess is "
						+ ((guess < secretNumber) ? "lower" : "")
						+ ((guess > secretNumber) ? "higher" : "")
						+ " than the actual number");
			}
			numGuesses++;
		} while (guess != secretNumber);
		System.out.println("Congratulations, you found it!");
		System.out.printf("You guessed %d times!\n", numGuesses);

	}

}
