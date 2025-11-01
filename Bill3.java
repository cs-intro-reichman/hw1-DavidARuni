// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		// Input: three names and the total bill amount.
	    String name1 = args[0];
		String name2 = args[1];
		String name3 = args[2];

		double bill = Double.parseDouble(args[3]);
		
		// Compute each diner's share of the bill.
		double split = (int) bill / 3;
		
		System.out.printf("Dear %s, %s, and %s: pay %.1f Shekels each%n",
							name3, name2, name1, split);
	}
}