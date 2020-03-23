package sort;

import java.util.ArrayList;
import java.util.Arrays;

public class SortAndremoDupli {

	public static void main(String[] args) {
		int[] num = { 5, 8, 2, 6, 1, 9, 8, 2, 10, 4 ,3};
		int temp;

		/*
		 * for (int i = 1; i < num.length; i++) { for (int j = i; j > 0; j--) {
		 * 
		 * if (num[j] < num[j - 1]) { temp = num[j]; num[j] = num[j - 1]; num[j - 1] =
		 * temp; }
		 * 
		 * } } for (int i = 0; i < num.length; i++) { System.out.print(num[i] + " "); }
		 */ 

		Arrays.sort(num);
		
		
		for(int i =0; i<num.length; i++) {
			System.out.print(num[i]+" ");
			
		}
		System.out.println();
		
		ArrayList<Integer>count =new ArrayList<Integer>();
		count.add(num[0]);
		
		for(int i =1; i<num.length;i++) {
			if(num[i]!= num[i-1]) {
				count.add(num[i]);
			}
			
		}
		
		for(int i = 0; i<count.size();i ++) {
			System.out.print(count.get(i)+" ");
		}
	}

}






