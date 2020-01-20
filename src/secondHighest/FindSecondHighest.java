package secondHighest;

public class FindSecondHighest {

	public static void main(String[] args) {
		int []num = {10,15,20,85,95};
		
		int firstLarge = num[0];
		int secondLargest = num[0];
	
		
		
		
		for (int i =0;i<num.length; i++) {
		
			if(firstLarge<num[i]) {
				
				secondLargest= firstLarge;
				firstLarge= num[i];
				
			}
			else if(secondLargest<num[i]){
				
				secondLargest =num[i];
				 
				 
			}
			
					
		}
		System.out.println("firstLarge>>>>>>>>>>>>>"+firstLarge);
		System.out.println("secondLarge>>>>>>>>>>>"+secondLargest);
	

	}

}
