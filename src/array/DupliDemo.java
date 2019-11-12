package array;

public class DupliDemo {

	public static void main(String[] args) {
		
		int temp;
		
		
		 int []array = {4,5,8,45,90,9,11,4,6,6,18,8,2};
		 for (int i =1; i<array.length; i++) {
			 for(int j =i; j>0; j-- ) {
				 
				 if (array[j] < array[j-1]) {
					 
				 temp = array[j];
				 array[j] = array[j-1];
				 array[j-1] =temp;	 
				 }
				 		 }
		 }
		 for ( int i =0; i<array.length; i++) {
			 System.out.print( " "+array[i]);
			 
		 }
		 
	}

}
