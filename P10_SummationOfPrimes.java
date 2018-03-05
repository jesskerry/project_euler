import java.util.ArrayList;

public class P10_SummationOfPrimes {
	/*
	 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
	 * 
	 * Find the sum of all the primes below two million.
	 */
	
	public static void main(String[] args) {
		long sum = 0;
		
		for(int i=2; i<2000000; i++) {
			if(isPrime(i)) {
				sum += i;
			}
		}
		System.out.println("Sum: " + sum);
	}
	
	private static boolean isPrime(int num) {
		boolean isPrime = true;
		for(int i = 2; i<=Math.sqrt(num); i++) {
			if(num % i == 0) {
				isPrime = false;
			}
		}
		return isPrime;
	}
}
