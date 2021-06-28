/*
 Name: Md Shamsul Arefeen

Problem: Problem 3: Write two java methods which will return two different integer values, write a program to compare those
		numbers and send message that one number is bigger than other. (hints: using if..else)
		*/
package assignment4;

public class MethodClass {

	int method_a() {
		return 50;
	}

	int method_b() {
		return 20;
	}

	public static void main(String[] args) {
		MethodClass ob1 = new MethodClass();
		ob1.method_a();
		ob1.method_b();

		if (ob1.method_a() > ob1.method_b()) {
			System.out.println("a is bigger");
		} else if (ob1.method_b() > ob1.method_a()) {
			System.out.println("b is bigger");
		} else {
			System.out.println("No Grade  is bigger or equal");
		}

	}

}
