package array;

public class ArrayDemo {

	public static void main(String[] args) {
		
		int [][] count = new int [3][3];
		
		count [0][0]= 10;
		count [0][1]= 20;
		count [0][2]= 30;
		count [1][0]= 40;
		count [1][1]= 50;
		count [1][2]= 60;
		count [2][0]= 70;
		count [2][1]= 80;
		count [2][2]= 90;
		
		for ( int row =0; row<3; row++) {
			for( int col =0; col<3; col++) {
				System.out.print(" " +count [row][col]);
			}
			System.out.println();
		}
		
	}

}
