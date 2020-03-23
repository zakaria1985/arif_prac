package sort;

import java.util.ArrayList;

public class SortingNum {

	public static void main(String[] args) {
		Integer [] number = {2,5,8,10,4,6,3,3,9,1};
		
		int temp;
		
		for(int i=1;i<number.length;i ++) {
			
			for (int j= i; j>0; j--) {
				
				if(number[j]<number[j-1]) {
					
					temp = number[j];
					number[j]= number[j-1];
					number[j-1]= temp;
				}
				
			}
			
		}

		for(int i=0; i<number.length;i++) {
			System.out.print(" "+number[i]);
		}
		
		
		ArrayList<Integer> dupli = new ArrayList<Integer>();
		dupli.add(number[0]);
		for (int i = 1; i < number.length; i++) {
			if (number[i] != number[i - 1]) {
				dupli.add(number[i]);
			}
		}
		System.out.println();
		for (int i = 0; i < dupli.size(); i++) {
			System.out.print(" " + dupli.get(i));
		}
		 
	}

}
