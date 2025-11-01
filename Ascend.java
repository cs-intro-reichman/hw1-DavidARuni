// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {

		// Parse the lower and upper bounds from command line arguments.
		int lower = Integer.parseInt(args[0]);
		int upper = Integer.parseInt(args[1]);

		// Generate three random integers in the given range [lower, upper].
		int num1 = (int) (Math.random() * (upper - lower + 1)) + lower;
		int num2 = (int) (Math.random() * (upper - lower + 1)) + lower;
		int num3 = (int) (Math.random() * (upper - lower + 1)) + lower;

		// Position the three numbers in increasing order.
		if (num1 > num2) {
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
		if (num2 > num3) {
			int temp = num2;
			num2 = num3;
			num3 = temp;
			
			// After swapping num2 and num3, we need to check num1 and num2 again.
			if (num1 > num2) {
				temp = num1;
				num1 = num2;
				num2 = temp;
			}
		}
		System.out.printf("%d, %d, %d%n", num1, num2, num3);
	}
}
