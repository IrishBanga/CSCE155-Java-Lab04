package unl.soc;

/**
 * Author: 
 * Date: 
 *
 * This program generates a multiplication table
 * of the size given as a command line argument.
 */
public class MultTable {

	public static void main(String args[]) {

		if (args.length != 1) {
			System.err.println("Usage: provide an integer n");
			System.exit(1);
		}

		int n = Integer.parseInt(args[0]);
		if (n <= 0) {
			System.err.println("empty table!");
			System.exit(1);
		}

		// TODO: place your code here
	}
}
