package sort;

import java.util.ArrayList;

public class Sorting2 {

	public static void main(String[] args) {
		int []number = {12,15,2,5,10,9,7,3,4,3,10};
		
		int temp;
		for(int i = 1; i<number.length; i++) {
			for(int j=i; j>0; j--) {
				if( number[j]<number[j-1]) {
					
					temp= number[j];
					number[j]= number[j-1];
					number[j-1]=temp;
					
			
				}
			}
		}
		
		for (int i =0; i<number.length; i++) {
			System.out.print(" "+number[i]);
		}
		
		
		ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(number[0]);
		for(int i = 1; i<number.length;i++) {
			if( number[i]!= number[i-1]) {
				num.add(number[i]);
				
				
			}
		}
		System.out.println();
		System.out.println("<<after duplicate>>");
		
		for (int i =0; i<num.size();i++) {
			System.out.print(" "+num.get(i));
		}
	}
}
