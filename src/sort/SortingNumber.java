package sort;

import java.util.ArrayList;
import java.util.Arrays;

public class SortingNumber {

	public static void main(String[] args) {
		int []count = {1,5,4,8,3,9,2,10,3,6,7,6,10};
		
		
		
		//Arrays.sort(count);
		
		//System.out.println(Arrays.toString(count));
		
		int temp;
		for(int i=1 ;i<count.length; i++) {
			
			for(int j=i;j>0; j--) {
				
				if(count[j]<count[j-1]) {
					
					temp= count[j];
					count[j]= count[j-1];
					count[j-1]= temp;
					
				}
			}
			
		}
		for (int i= 0; i<count.length;i++) {
			System.out.print(" "+count [i]);
		}
		
		
			
	ArrayList<Integer> num = new ArrayList<Integer>();
	num.add(count[0]);
	for(int i =1; i<count.length; i++) {
		if(count[i]!= count[i-1]) {
			num.add(count[i]);
		}
		
		}
	System.out.println();
	//for(int i=0; i<num.size();i++) {
		//System.out.print(" "+num.get(i));
	//}
	
	for(int x:num) {
		System.out.print(" "+x);
	}

	}

}
