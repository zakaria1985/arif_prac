package longAndShort;

public class FindLongAndShortWord {

	public static void main(String[] args) {
		String text = " we live in a newYork city of America";
		int len =text.length();
		String []split =text.split(" ");
		
		String shortest = split[0];
		
		String longest ="";
		
		for(String x:split) {
			if (x.length()<shortest.length()) {
				shortest =x;
				
			}else if (x.length()>longest.length()) {
				longest =x;
			}
			
		}
		
	System.out.println(len);
	System.out.println(shortest);
	System.out.println(longest);
	System.out.println(len);
	}

}
