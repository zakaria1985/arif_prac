package sort;

import java.util.ArrayList;
import java.util.Arrays;

public class Soorrt {

	public static void main(String[] args) {
		int[] num = {3,5,8,7,9,5,8,2,10,4,1};
Arrays.sort(num);



ArrayList<Integer>number = new ArrayList<Integer>();
number.add(num[0]);

for(int i=1; i<num.length; i++) {
	if(num[i]!= num[i-1]) {
		number.add(num[i]);
	}
}
for(int i =0; i<number.size();i++) {
	System.out.println(number.get(i));
}
	}

}
