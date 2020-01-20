package longAndShort;

public class ShortAndLong {

	public static void main(String[] args) {
		String sen = "we have a fish and this is a malefish";
		
		 String[] text =sen.split(" ");
		 
		 String shortest = text[0];
		 String longest ="";
		 
		 
		 for (String x:text) {
			 if (x.length()<shortest.length()) {
				 shortest=x;
			 }
			 else if (x.length()>longest.length()) {
				 longest=x;
				
			 }
		 }
		 System.out.println(shortest);
		 System.out.println(longest);
		
	}

}
