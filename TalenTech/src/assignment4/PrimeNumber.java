/*
 NAME: MD SHAMSUL AREFEEN
 
Problem 4:	Write a java program to find the prime number from 1 to 100 and print them.
 
 */

package assignment4;

public class PrimeNumber {

	public void primeDemo() {
		for (int i = 2; i <= 100; i++) {
			for (int j = 2; j <= i; j++) {
				if (j == i) {
					System.out.println(i);
				}
				if (j % i == 0)
					break;
			}

		}
	}

	public static void main(String[] args) {

		PrimeNumber obj = new PrimeNumber();
		obj.primeDemo();

	}

}
