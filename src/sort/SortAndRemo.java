package sort;

import java.util.ArrayList;
import java.util.Arrays;

public class SortAndRemo {

	public static void main(String[] args) {
		int [] num = {1,15,2,8,2,9,10,5,3,3,7,4,6,5};
		Arrays.parallelSort(num);
		
		
		for(int i =0; i<num.length; i++) {
			
			System.out.print(" "+num[i]);
		}
		
		
		
		ArrayList<Integer>number = new ArrayList<Integer>();
		
		number.add(num[0]);
		for(int i=1; i<num.length; i++ ) {
			if(num[i]!=num[i-1]) {
				number.add(num[i]);
			}
		}
			System.out.println();
		for(int i =0;i<number.size();i++) {
			System.out.print(" "+number.get(i));
		}
		}
		
}
