package sort;

import java.util.ArrayList;
import java.util.Arrays;

public class Sortanddup {

	public static void main(String[] args) {
	int[] num= {1,5,3,17,9,4,2,5,15,6,20,60};
    System.out.println(num.length);
	Arrays.parallelSort(num);
	
	for (int i=0; i<num.length;i++) {
		System.out.print(" "+num[i]);
	}
		
		System.out.println();
		
		ArrayList<Integer>number = new ArrayList<Integer>();
		number.add(num[0]);
		
		for(int i = 1; i<num.length;i++) {
			if(num[i]!=num[i-1]) {
				number.add(num[i]);
			}
		}
	
	for(int i= 0; i<number.size();i ++) {
		System.out.print(" "+number.get(i));
	}

	}

}
