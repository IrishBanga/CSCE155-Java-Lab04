package unl.soc;

import java.util.Random;
import java.util.Scanner;

/**
 * Author: Irish Banga
 * Date: 2023/12/18
 *
 * A program where the user provides a range from which the computer
 * is supposed to guess the number of user's choosing!
 * The user is supposed to provide feedback indicating whether the
 * guess is correct or if is higher or lower than the user's number
 */
public class RevGuessingGame {

	public static void main(String[] args) {
		
		int lower=0,upper=0;
		System.out.println("Let's begin the Guess-A-Number Game!");
		Scanner in=new Scanner(System.in);
		do {
			System.out.println("Please provide the lower and upper bound of range to guess the number!");
			System.out.print("Lower bound: ");
			lower = in.nextInt();
			System.out.print("Upper bound: ");
			upper = in.nextInt();
		} while (upper < lower);
		System.out.printf("Proceeding with range %d - %d\n",lower,upper);

		Random randomNumber = new Random();
		int guess=0;
		
		int numGuesses = 0;
		Character userInput='x';
		Boolean converged=false;
		while (!(userInput == 'c' || userInput == 'C' || converged)) {
			if (upper != lower) {
				guess = lower + randomNumber.nextInt(upper - lower + 1 );
				System.out.printf(
						"Please indicate if the my guess [%d] is a match(C or c) OR is lower(L or l), higher(H or h)) than the actual number\n",
						guess);
				userInput = in.next().charAt(0);
				if (userInput == 'l' || userInput == 'L') {
					if (guess == upper) {
						System.out.println("WARNING: Please indicate correctly!!!");
						System.out.printf("Proceeding with range %d - %d\n",lower,upper);
					} else {
						lower = guess + 1;
						System.out.printf("Proceeding with range %d - %d\n",lower,upper);
					}
				}
				if (userInput == 'h' || userInput == 'H') {
					if (guess == lower) {
						System.out.println("WARNING: Please indicate correctly!!!");
						System.out.printf("Proceeding with range %d - %d\n",lower,upper);
					} else {
						upper = guess - 1;
						System.out.printf("Proceeding with range %d - %d\n",lower,upper);
					}
				}
				numGuesses++;
			} else {
				converged=true;
				guess=lower;
				System.out.printf("Bounds converged to %d.Number identified!\n", lower);
			}
		}
		System.out.printf("Computer guessed the value [%d] correctly in %d tries!\nExiting the game!\n", guess, numGuesses);
	}

}
