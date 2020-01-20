package sort;

import java.util.ArrayList;
import java.util.Arrays;

public class Sort_dupli {

	public static void main(String[] args) {
		int[] count = {1,2,2,3,4,4,6,6,5,5,8,4,9,5};
		//Arrays.parallelSort(count);
		
		
		ArrayList<Integer>num = new ArrayList<Integer>();
		num.add(count[0]);
		
		for(int i=1;i<count.length;i++) {
			if(count[i] != count[i-1]){
				num.add(count[i]);
				
			}
			
			
			
		}
		
		
		for(int i =0; i<num.size();i++) {
			System.out.print(" "+num.get(i));
		}
		

	}

}
