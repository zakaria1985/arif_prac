package longAndShort;

public class FindLandShortWord {

	public static void main(String[] args) {
		String word = "we want to taravel to Canada";
		  String[]  text =word.split(" ");
		  
		  String shortest = text[0];
		  String largest = text[0];
		  
		
		  for(String x:text) {
			  if(shortest.length()>x.length()) {
				  
				 shortest= x;
			  }else if( largest.length()<x.length()) {
				  largest= x;
				  
			  }
			  
		  }
		  
System.out.println(shortest);
System.out.println(largest);
	}
}

