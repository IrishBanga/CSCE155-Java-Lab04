package unl.soc;

/**
 * Author: Irish Banga
 * Date: 2023/12/18
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
		/*for (int i = 10; i < 20; i += 3) {
			System.out.print(i + " ");
		}*/
		int a=10;
		while(a<20)
		{
			System.out.print(a + " ");
			a+=3;
		}
		System.out.println();

		// 2. Rewrite the given while loop as an equivalent for loop
		/*int k = 3;
		while (k > -4) {
			System.out.print(k + " ");
			k--;
		}*/
		for(int k=3;k>-4;k--)
		{
			System.out.print(k + " ");
		}
		System.out.println();

		// 3. Print numbers 1 thru n separated by a comma except for
		// the last one; example: 1, 2, 3, 4, 5
		for(int i=1;i<=n;i++)
		{
			System.out.print(i);
			if(i!=n)System.out.print(", ");
		}
		System.out.println();
		// 4. Print squares of numbers 1 thru n separated by a comma
		// except for the last one; example: 1, 4, 9, 16, 25
		for(int i=1;i<=n;i++)
		{
			System.out.print(i*i);
			if(i!=n)System.out.print(", ");
		}
		System.out.println();
		// 5. Compute the summation of numbers 1 thru n and print
		// the result; example: 1 + 2 + 3 + 4 + 5 = 15
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum+=i;
			System.out.print(i);
			System.out.print((i==n)?(" = "+sum):(" + "));
		}
		System.out.println();
		// 6. Compute the summation of squares of numbers 1 thru n
		// and print the result; example: 1^2 + 2^2 + 3^2 + 4^2 + 5^2 = 55
		sum=0;
		for(int i=1;i<=n;i++)
		{
			sum+=(i*i);
			System.out.print(i);
			System.out.print((i==n)?(" = "+sum):(" + "));
		}
		System.out.println();
		// 7. Compute the summation of even numbers 1 thru n and print
		// the result; example (n=5): 2 + 4 = 6
		sum=0;
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				sum+=i;
				System.out.print(i);
			}
			System.out.print((i==n)?(" = "+sum):((i%2==0)?(" + "):("")));
		}
		System.out.println();

		// 8. Write a solution to the following variation of the FizzBuzz
		// problem. Print out integers 1 thru n, one to a line, except
		// that if the integer is divisible by 7 print "Foo" instead.
		// If the integer is divisible by 11 print "Bar" instead. If
		// the integer is divisible by both 7 and 11, print "FooBar"
		// instead.
		for(int i=1;i<=n;i++)
		{
			/*if(i%7==0 && i%11==0)
			{
				System.out.println("FooBar");
			}else if(i%7==0)
			{
				System.out.println("Foo");
			}else if(i%11==0)
			{
				System.out.println("Bar");
			}*/
			if(i%7==0 || i%11==0)
			{
				System.out.println(((i%7==0)?"Foo":"")+((i%11==0)?"Bar":""));
			} else
			{
				System.out.println(i);
			}
		}
	}
}
