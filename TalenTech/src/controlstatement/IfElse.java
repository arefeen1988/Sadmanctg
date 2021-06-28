package controlstatement;

public class IfElse {

	public static void main(String[] args) {

		int john = 30;

		int peter = 20;

		if (john > peter) {

			System.out.println("older");
		}

		else if (peter > john) {
			System.out.println("younger");
		}

		else if (john == peter) {
			System.out.println("same age");
		}

		else {
			System.out.println("Not same age");
		}
	}

}
