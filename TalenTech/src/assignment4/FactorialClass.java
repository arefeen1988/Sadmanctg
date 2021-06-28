/*
 MD SHAMSUL AREFEEN
 PROBLEM: Write Java Program to display Factorial of Number 7.

 
 */


package assignment4;

public class FactorialClass {

	public static void main(String[] args) {

		int num = 7;
		int fact = 1;
		for (int i = num; i >= 1; i--) {
			fact = fact * i;

		}
		System.out.println("Factorial of " + num + " =" + fact);

	}

}
