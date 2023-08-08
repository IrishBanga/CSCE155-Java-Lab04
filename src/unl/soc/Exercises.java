package unl.soc;

/**
 * Author(s): Date:
 * 
 * This is a series of exercises to introduce loop control structures.
 *
 */
public class Exercises {

	public static void main(String args[]) {
		if (args.length != 1) {
			System.err.println("Usage: provide an integer n");
			System.exit(1);
		}

		int n = Integer.parseInt(args[0]);

		// A simple for loop that prints 0 thru 9
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}

		// 1. Rewrite the given for loop as an equivalent while loop
		for (int i = 10; i < 20; i += 3) {
			System.out.print(i + " ");
		}
		System.out.println();

		// 2. Rewrite the given while loop as an equivalent for loop
		int k = 3;
		while (k > -4) {
			System.out.print(k + " ");
			k--;
		}
		System.out.println();

		// 3. Print numbers 1 thru n separated by a comma except for
		// the last one; example: 1, 2, 3, 4, 5

		// 4. Print squares of numbers 1 thru n separated by a comma
		// except for the last one; example: 1, 4, 9, 16, 25

		// 5. Compute the summation of numbers 1 thru n and print
		// the result; example: 1 + 2 + 3 + 4 + 5 = 15

		// 6. Compute the summation of squares of numbers 1 thru n
		// and print the result; example: 1^2 + 2^2 + 3^2 + 4^2 + 5^2 = 55

		// 7. Compute the summation of even numbers 1 thru n and print
		// the result; example (n=5): 2 + 4 = 6

		// 8. Write a solution to the following variation of the FizzBuzz
		// problem. Print out integers 1 thru n, one to a line, except
		// that if the integer is divisible by 7 print "Foo" instead.
		// If the integer is divisible by 11 print "Bar" instead. If
		// the integer is divisible by both 7 and 11, print "FooBar"
		// instead.
	}
}
