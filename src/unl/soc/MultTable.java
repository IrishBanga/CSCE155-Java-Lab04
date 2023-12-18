package unl.soc;

/**
 * Author: Irish Banga
 * Date: 2023/12/18
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
		} else {
			// TODO: place your code here
			System.out.printf(" ---");
			for (int i = 1; i <= n;System.out.printf("%4d", i++));
			System.out.println();
			
			for (int i = 1; i <= n; i++) {
				System.out.printf("%4d", i);
				for (int j = 1; j <= n; j++) {
					System.out.printf("%4d", i * j);
				}
				System.out.println();
			}
		}
	}
}
