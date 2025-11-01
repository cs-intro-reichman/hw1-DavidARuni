// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {

	    // Parse the input number from the command line argument.
	    int number = Integer.parseInt(args[0]);

		// validate the input number is in the range 0 to 999.
		if (number < 0) {
			System.out.println("Invalid number format");
			return;
		}

		// Extract hundreds, tens, and units digits.
		int hundreds = number / 100;
		int tens = (number / 10) % 10;
		int units = number % 10;

		// Print the result in the desired format.
		System.out.printf("%d hundreds, %d tens, and %d ones.%n", 
							hundreds, tens, units);

	}
}
