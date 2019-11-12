package array;

public class ArrayDemo1 {

	public static void main(String[] args) {
		// String [][]text =new String[3][3];

		// text [0][0] = "Arif ";
		// text [0][1] = " Id 10001 ";
		// text [0][2] = " arif@yahoo ";
		// text [1][0] = "Tusar ";
		// text [1][1] = "id 20000 ";
		// text [1][2] = "tusr@gmail ";
		// text [2][0] = "Motin";
		// text [2][1] = "ID 6000 ";
		// text [2][2] = "zoytazjpm @hotmail ";

		String[][] text = { { "arif", " id 100", " arif@j" }, { " tusar", "id200", "mahide@l" },
				{ " motin", " id500", " zoytaz" } };

		for (int row = 0; row < text.length; row++) {

			for (int col = 0; col < text.length; col++) {

				System.out.print(" " + text[row][col]);
			}
			System.out.println();

		}

		System.out.println(text[0][0] + text[2][2]);
	}

}
