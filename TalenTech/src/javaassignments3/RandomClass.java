// Md shamsul Arefeen


/*
 Write a Java program with a method name myRandomNumbers() that can generate any random integer from 1 – 100 using this code: 
 int randomNumber = (int) Math.floor(Math.random() * 100);
You have to get the random integer number in main() method and display with a printout saying that if that particular random integer is an Even or Odd number.

 */

package javaassignments3;

public class RandomClass {

	public void myRandomNumbers() {
		int randomNumber = (int) Math.floor(Math.random() * 100);

		if (randomNumber % 2 == 0) {
			System.out.println(randomNumber + " it is an even Number");
		} else {
			System.out.println(randomNumber + " It is an odd number ");
		}
	}

	public static void main(String[] args) {

		RandomClass obj = new RandomClass();
		obj.myRandomNumbers();

	}

}
