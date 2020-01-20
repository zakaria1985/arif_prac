package sort;

import java.util.ArrayList;

public class Soretting1 {

	public static void main(String[] args) {
	int[] num = {1,5,6,8,9,10,2,4,3,5,4,7};
	
	int temp;
	
	for (int i = 1;i<num.length;i++) {
		
		for(int j=i; j>0 ;j--) {
			if (num[j]<num [j-1] ){
				
				temp =num[j];
				num[j]=num[j-1];
				num[j-1]= temp;
				
			}
		}
	}
	
	for(int i =0; i<num.length;i++) {
		System.out.print(" "+num[i]);
	}
	
	ArrayList<Integer>number= new ArrayList<Integer>();
	number.add(num[0]);
	for(int i=1; i<num.length; i++) {
		
		if (num[i]!=num[i-1]) {
			number.add(num[i]);
		}
	}
	System.out.println();
	
	for (int i=0; i<number.size();i++) {
		System.out.print("  "+number.get(i));
		
	}
	}

	}










