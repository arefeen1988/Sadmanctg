/*
 MD SHAMSUL AREFEEN;
 PROBLEM:
A triangle has three arms : 5, 7 and 11 inches. Write a method to display the perimeter of triangle in console output.

 */

package assignment4;

public class TriangleClass {

	int trianglePerimeter() {
		int arm1 = 5;
		int arm2 = 7;
		int arm3 = 11;
		int total = arm1 + arm2 + arm3;
		return total;

	}

	public static void main(String[] args) {

		TriangleClass t1 = new TriangleClass();
		t1.trianglePerimeter();
		System.out.println(t1.trianglePerimeter());

	}

}
