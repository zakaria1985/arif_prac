package maximumAndMinimum;

public class MaxAndM {

	public static void main(String[] args) {
		int []num = {2,15,7,8};
		
		int max = num[0];
		int min = num[0];
		int secmax = num[0];
		
		for(int i=0; i<num.length;i++) {
			if(num[i]>max) {
				secmax =max;
				max= num[i];
			}
			else if(num[i]>secmax) {
				secmax =num[i];
			}
			
			
			else if(num[i]<min) {
				min =num[i];
			}
		}
		System.out.println(max);
		System.out.println(secmax);
		System.out.println(min);

	}

}
