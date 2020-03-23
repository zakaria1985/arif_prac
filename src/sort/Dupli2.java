package sort;

import java.util.ArrayList;
import java.util.Arrays;

public class Dupli2 {

	public static void main(String[] args) {
		int[]num = {9,7,3,4,5,2,8};
		Arrays.sort(num);
		
		for(int i = 0; i<num.length;i++) {
			System.out.print(" "+num[i]);
		}
		
		
		System.out.println();
		
		ArrayList<Integer> number = new ArrayList<Integer>();
		number.add(num[0]);
		for(int i=1;i<num.length;i++) {
			if(num[i]!=num[i-1]) {
				number.add(num[i]);
			}
			
			
		}
		for(int i=0;i<number.size();i++) {
			System.out.print(" "+number.get(i));
			
		}
		
		
	}

}
