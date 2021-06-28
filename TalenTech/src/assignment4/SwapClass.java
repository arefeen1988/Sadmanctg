/*
MD SHAMSUL AREFEEN
PROBLEM:You are given two integer number (a=25, b=30), write a program to swap them and display result on the screen.    
 
 */

package assignment4;

public class SwapClass {

	public static void main(String[] args) {

		int a, b, c;
		a = 25;
		b = 30;
		System.out.println("Before swapping a :" + a + " & b =" +b);

		c = a;
		a = b;
		b = c;
		System.out.println("After swapping value a:" + a + " & b =" +b);

	}

}
