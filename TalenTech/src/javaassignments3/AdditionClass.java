
/*
 Shamsul Arefeen
 Date : 
 A method which returns the multiply value of a and b where a = 9 and b = 11.  Write a program which will display addition of a +b +method returns value.

 */

package javaassignments3;

public class AdditionClass {

	public  int multiplyValue() {

		int a = 9;
		int b = 11;
		int c = 99;// (9*11)
		int addition = (a + b + c);
		return addition;

	}

	public static void main(String[] args) {

		AdditionClass obj = new AdditionClass();
		obj.multiplyValue();
		System.out.println(obj.multiplyValue());
		

	}

}
