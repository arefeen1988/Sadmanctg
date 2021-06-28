/*
 MD SHAMSUL AREFEEN
 PROBLEM : Write a Java program to convert temperature from Fahrenheit to Celsius degree. 
 
 */

package assignment4;

public class TemperatureClass {

	public static void main(String[] args) {
		
		
		//temperature in fahrenheit
		
		double fahrenheit = 30.0;
		double celsius = 0.0;
		
		// calculationg celsius temperature
		
		celsius = (fahrenheit-32)/1.8;
		
		System.out.println("Temperature ="+celsius);
	}

}
