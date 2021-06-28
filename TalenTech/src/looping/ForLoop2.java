package looping;

public class ForLoop2 {

	// Write a for loop up to 600 and which will also increase the value double
	// every time.
	// Print the value of the counter variable that you used during the for loop
	// initialization and each value should be separated by the pipe (|) in the same
	// line.
	// Example output: 1|2|4|8

	public static void main(String[] args) {

		for (int c = 1; c <= 600; c = c * 2) {

			System.out.print(c + "|");

		}

	}

}
