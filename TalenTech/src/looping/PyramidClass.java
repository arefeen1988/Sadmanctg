package looping;

public class PyramidClass {

	public static void main(String[] args) {

		/*
		  Write a java program that would display the following:
		 
		 *
		 **
		 ***
		 ****
		 *****
		 ******
		 ******* 
		 
		 */

		int rows= 7;

		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= i; j++) {

				System.out.print("* ");

			}
			System.out.println();
		}

	}

}
