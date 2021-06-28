//Md Shamsul Arefeen

//Write a Java program which will display name and Guesstimate age of every students in your class. (write separate method for every student).

package javaassignments3;

public class StudentClass {

	String name = " Shakib Al Hasan ";
	int age1 = 34;
	
	
	String name2 = " Virat kohli ";
	int age2 = 32;

	public void displayInformation1() {
		System.out.println("Name =" + name);
		System.out.println("Age1 =" + age1);
	}

	public void displayInformation2() {
		System.out.println("Name2 =" + name2);
		System.out.println("Age2 =" + age2);
	}

	public static void main(String[] args) {

		StudentClass obj1 = new StudentClass();
		obj1.displayInformation1();
		System.out.println();
		StudentClass obj2 = new StudentClass();
		obj2.displayInformation2();

	}

}
