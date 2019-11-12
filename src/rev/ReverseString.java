package rev;

public class ReverseString {

	public static void main(String[] args) {
		

		
		String st = "we are in burger king";
		String [] text =st.split("");
		
	String 	rev = "";
	
		for (int i= text.length-1; i>= 0; i--) {
			 rev= rev+text[i];
		
			
	}
		System.out.println(rev);
		
		
	int [] num = {45,15,5,10,6,5};
	 int large = num [4];
	 int small = num [2];
	
	 for(int i =0; i<num.length; i++) {
		 if (large<num[i]) {
			 large = num[i];
		 }
		 
		 else if(small>num[i]) {
			 small = num[i];
		 }
		 
	 }
		
	 System.out.println("largest="+large);
	 System.out.println("smalest="+small);
		
	}
	
	

}
