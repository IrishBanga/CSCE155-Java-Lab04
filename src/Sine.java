/** 
 * CSCE 155 Lab Looping - Java Version
 * 
 * Sine.java
 * A program to approximate the sine of a provided number.
 */

public class Sine {
	
	public static void main( String[] args ){
		
		// Check for the correct number of arguments
		if( args.length != 2 ){
			System.out.println( "Incorrect number of arguments supplied.  Program closing..." );
			System.exit(1);
		}
		
		double x = Double.parseDouble( args[0] );
		int n = Integer.parseInt( args[1] );
		
		double result = 0.0;
		
		// Compute sin(x) using a Taylor series out to n terms
		
	         System.out.printf( "Sine(%f) = %f\n", x, result );
		
	}

	/**
	 *  A method that computes and returns the factorial of provided integer n 
	 *  
	 * @param n
	 * @return
	 */
	private static long factorial( int n ){
		
		long result = 1, i;
		
		for( i = 2; i <= n; i++ ){
			
			result *= i;
		}
		
		return result;
		
	} 

	
}
