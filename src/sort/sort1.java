package sort;

import java.util.ArrayList;
import java.util.Arrays;

public class sort1 {

	public static void main(String[] args) {
		int [] number = {2,8,6,2,1,5,5,9,10,3,4,7};
		/*Arrays.sort(number);
		
		for(int i = 0; i<number.length;i++) {
			System.out.print(" "+number[i]);}*/
		
		int temp;
		for(int i=1; i<number.length;i++) {
			for(int j=i; j>0; j--) {
				if(number[j]<number[j-1]) {
					temp= number[j];
					number[j]= number[j-1];
					number[j-1]=temp;
				}
				
			}
		}
		for(int i=0; i<number.length;i++) {
			System.out.print(" "+number[i]);
		}
		System.out.println();
		ArrayList<Integer>num = new ArrayList<Integer>();
		num.add(number[0]);
		
		for(int i=1;i<number.length;i++) {
			if(number[i]!=number[i-1]) {
				num.add(number[i]);
			}
		}
   for (int i =0; i<num.size();i++) {
	   System.out.print(" "+num.get(i));
   }
	}

}
