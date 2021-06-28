
//Shamsul Arefeen.

//A method returns 30, another method returns 50. Write a java program which will display subtraction value from bigger number to smaller.

package javaassignments3;

public class SubstractionClass {

	public int methodA() {
		return 30;
	}

	public int methodB() {
		return 50;

	}

	public int methodC() {
		return (50 - 30);

	}

	public static void main(String[] args) {
		SubstractionClass obj = new SubstractionClass();
		obj.methodC();
		System.out.println(obj.methodC());

	}

}
