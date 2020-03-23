package maximumAndMinimum;

public class maxAndMinNum {
	public static void main(String[]args) {
		int [] num= {2,15,20,25,8,};
		
		int max = num[0];
		int secMax =num[0];
		int min = num[0];
		
		for( int i=0; i<num.length; i++) {
			
			if(num[i]>max) {
				secMax = max;
				max = num[i];
			}
			
			else if(num[i]>secMax) {
				secMax = num[i];
			}
			
			
			else if (num[i]<min) {
				min= num[i];
			}
		}
		
		System.out.println(max);
		System.out.println(secMax);
		System.out.println(min);
		
	}

}
