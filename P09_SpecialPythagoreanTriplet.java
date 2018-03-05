import java.util.ArrayList;

public class P09_SpecialPythagoreanTriplet {
	/*
	 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which
	 * a^2 + b^2 = c^2. For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
	 * 
	 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
	 * 
	 * Find the product abc.
	 */

	public static void main(String[] args) {
		ArrayList<Integer> perfectSquares = getPerfectSquares();
		for (Integer cSquared : perfectSquares) {
			for (Integer aSquared : perfectSquares) {
				if (aSquared < cSquared) {
					int c = (int) Math.sqrt(cSquared);
					int a = (int) Math.sqrt(aSquared);
					int b = 1000 - c - a;
					if (b > 0) {
						int bSquared = (int) Math.pow(b, 2);
						if (aSquared + bSquared == cSquared) {
							System.out.println("a * b * c = " + (a * b * c));
						}
					}
				}
			}
		}

	}

	private static ArrayList<Integer> getPerfectSquares() {
		ArrayList<Integer> perfectSquares = new ArrayList<Integer>();
		for (int i = 2; i <= 998; i++) {
			perfectSquares.add((int) Math.pow(i, 2));
		}
		return perfectSquares;
	}
}
