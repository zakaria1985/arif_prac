package array;

public class dupliArray {

	public static void main(String[] args) {
		
	int temp;
		int[] array = {15,2,31,4,5,1,7,7,5,9,9};
		for(int i=1;i<array.length;i++) {
			for(int j= i;j>0; j--) {
				
				if (array[j]<array[j-1]) {
					temp = array[j];
					array[j]= array[j-1];
					array[j-1]= temp;
				}
				
			}
			
			
			
		}
		
	for(int i =0;i<array.length;i++) {
		System.out.print(" "+array[i]);
	}
	}

}
