package looping;

import java.util.Scanner;

public class WhileLoop {

	// Write a program in Java to display the multiplication table of (eight) 8. Use
	// While loop.

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int num;
		num = input.nextInt();
		int i = 1;
		while (i <= 10) {

			System.out.println(num + " X " + i + " = " + num * i);
			i++;

		}

	}

}
