package conditionPrac;

public class ConditionReturn {

	public static void main(String[] args) {
		
		zipcode(200);
		  String area = zipcode(200);
		
		System.out.println(area);
	}
		
	 //int zip = 112;
	  public static String zipcode(int zip) {
	  
		  String st = "null";
	 
	 if ( zip>= 1 && zip<= 100) {
	//System.out.println(" manhaton");
		 st=" manhaton";
		 }
	    else if ( zip >=101 && zip>=200) {
		 //System.out.println("queens");
	    	st = "queens";
		 }
		 
		 else if ( zip >=201 && zip>=300) {
			// System.out.println("brooklyn");
			 st = " brooklyn";
	 }
		 else if ( zip >=301 && zip>=400) {
			 //System.out.println("bronx");
			 st =" bronx";
		 }
	    else {
	    	//System.out.println(" not in zip code");
	    	st = " not in zip";
	    }
	 return st;
	 	}
	  
}
