package array;

public class Array2 {

	public static void main(String[] args) {

		int[][] number = new int[2][3];

		number[0][0] = 10;
		number[0][1] = 20;
		number[0][2] = 30;
		number[1][0] = 40;
		number[1][1] = 50;
		number[1][2] = 60;

		for (int r = 0; r <= 1; r++) {
			for (int c = 0; c <= 2; c++) {

				System.out.print(" "+number[r][c]);
			}
			System.out.println();
		}

	}

}
