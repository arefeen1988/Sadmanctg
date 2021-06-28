
// MD SHAMSUL AREFEEN
//Write a program to swap two string variables (Talen, Tech) and display result on the screen.  


package assignment4;

public class SwappingString {

	public static void main(String[] args) {
	
		
		String a = "Talen";
		String b = "Tech";
		System.out.println("Before swap :"+a+" "+b);
		a=a+b;
		b=a.substring(0, a.length()-b.length());
		a=a.substring(b.length());
		System.out.println("After swapping :"+a+ " "+b);

	}

}
