package maximumAndMinimum;

public class MaxAndMin {

	public static void main(String[] args) {
		int [] num = {5,8,15,6,5,14,18,20};
		
		int max= num[2];
		int min = num[3];
		
		for (int i=0; i<num.length; i++) {
			if (max<num[i]) {
				max=num[i];
			}
		}
			for(int i =0; i<num.length;i++) {
				
			 if(min>num[i]) {
				min=num[i];
			}
			
		}
		System.out.println(max);
		System.out.println(min);
	}

}
