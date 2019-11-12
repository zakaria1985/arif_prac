package array;

public class DuplicateRemove {

	public static void main(String[] args) {
		
		int[] array ={4,3,2,1,5,9,10,5,2};
		
		int temp;
		for( int i = 0; i<array.length; i++) {
			
			for( int j= i; j>0; j--) {
				
			if (array[j] <array[j-1]) {
				temp = array[j];
				array[j] = array [j-1];
				array[j-1]= temp;
				
				}
			}
			}
		
		for( int i=0; i<array.length; i ++) {
			System.out.print(" " + array[i]);
		}
		
	}

}
