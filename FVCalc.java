// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){

		// Replace this comment with your code
		int principal = Integer.parseInt(args[0]);
		double rate = Double.parseDouble(args[1]);
		int years = Integer.parseInt(args[2]);

		// Compute the future value.
		int futureValue = (int) (principal * Math.pow(1 + rate / 100, years));

		// Print the result.
		System.out.printf("After %d years, $%d saved at %.1f%%25 will yield $%d%n", 
							years, principal, rate, futureValue);
	}
}
