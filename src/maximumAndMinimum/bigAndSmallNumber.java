package maximumAndMinimum;

public class bigAndSmallNumber {

	public static void main(String[] args) {
		int []num= {15,20,48,65,25,99,75,7,11};
		
		
		int bigNum = num[0]; //15
		int smallNum= num[0];
		
		for (int i =0; i<num.length; i++) {
			
			if(bigNum<num[i]) {
				bigNum = num[i];
			}
			else if(smallNum>num[i]) {
				smallNum=num[i];
				
			}
			
		}
System.out.println(bigNum);
System.out.println(smallNum);
	}

}
