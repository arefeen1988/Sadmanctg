
/*
 
shamsul arefeen


 date:
 problem 1 : A rectangle width and length are: 9 and 13 inches. Write a method to display the perimeter of rectangle in console output.
 
 */

package javaassignments3;

public class RectangleClass {

	public int perimeterRectangle(int l, int w) {
		int perimeter = 2 * (l * w);
		return perimeter;

	}

	public static void main(String[] args) {
		int l = 9;
		int w = 13;

		RectangleClass obj = new RectangleClass();
		obj.perimeterRectangle(l, w);
		System.out.println(obj.perimeterRectangle(l, w));

	}

}
