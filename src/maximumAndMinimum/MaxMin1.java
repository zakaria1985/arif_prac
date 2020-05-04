package maximumAndMinimum;

public class MaxMin1 {

	public static void main(String[] args) {
		int [] number = { 15,50,45,12,5,25,98};
		int maxNum= number[0];
		int minNum = number[0];
		int secHigh = number[0];
		int secMin = number[0];
		
		for(int i= 0; i<number.length; i++) {
			if(number[i]>maxNum) {
				secHigh= maxNum;
			  maxNum= number[i];
			}
			 
			else if(number[i]>secHigh) {
				secHigh = number[i];
				
			}
			
			else if( number[i]<minNum) {
				secMin=minNum;
				minNum= number[i];
			}

			else if( number[i]<secMin) {
				secMin= number[i];
			}
			
			
		}
		System.out.println(maxNum);
		System.out.println(secHigh);
		System.out.println(minNum);
		System.out.println(secMin);
	}

}
