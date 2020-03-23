package sort;

import java.util.ArrayList;

public class removeDuoli {
	
	public static void main(String[]args) {
	int[] count = {32,15,18,20,20,25,15,30};
	int temp;
	
	for(int i =1;i<count.length; i++) {
	for(int j= i; j>0; j--) {
		if(count[j]<count[j-1]) {
			temp= count[j];
			count[j]=count[j-1];
			count[j-1]=temp;
			
		}
		
	}
		
	}
	for(int i =0; i<count.length; i++) {
		System.out.print(" "+count[i]);
	}
System.out.println();
ArrayList<Integer>num = new ArrayList<Integer>();
num.add(count[0]);

for(int i = 1; i<count.length;i++) {
	if(count[i]!= count[i-1]) {
		num.add(count[i]);
	}
}
for(int i=0; i<num.size();i++) {
	System.out.print(" "+num.get(i));
}
}
}


















