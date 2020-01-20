package sort;

import java.util.ArrayList;
import java.util.Arrays;

public class Sorting3 {

	public static void main(String[] args) {
		int [] count = {1,5,8,6,3,9,10,2,4,3,6,7};
		
		
		int temp;
		for(int i =1; i<count.length;i ++) {
			for(int j=i; j>0; j--) {
				
				if(count[j]<count[j-1]) {
					
					temp =count[j];
					count[j]=count[j-1];
					count[j-1]=temp;
					
				}
				
			}
			
		}
		for(int i =0; i<count.length;i++) {
			System.out.print(" "+count[i]);
		}
		
		System.out.println();
	
		int [] number = {10,15,20,25,30,40,15,25};
		Arrays.parallelSort(number);
	

		for(int x:number) {
			System.out.print(x+" ");
			
		}
		
		
		
		
		ArrayList<Integer> num = new ArrayList<Integer>() ;
		num.add(count[0]);
		
		for(int i =1; i<count.length;i++) {
			if(count[i]!=count[i-1]) {
				num.add(count[i]);
			}
		}
			System.out.println();
			
			for(int i= 0;i<num.size();i++) {
				System.out.print(num.get(i)+" ");
			}
			System.out.println();
			
			for(int x:num) {
				System.out.print(x+" ");
				
			}
			
	}

}
