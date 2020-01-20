package longAndShort;

public class FindLongAndShortWord {

	public static void main(String[] args) {
		String text = " we live in a newyork city of";
		
		String []split =text.split(" ");
		
		
		
		String longest =split[0];
		String shortest = split[0];
		
		for(String x:split) {
			
			if (x.length()>longest.length()) {
				longest =x;
				
			}else if (x.length()<shortest.length()) {
				shortest =x;
			}
			
		}
		
	//System.out.println(len);
	System.out.println(shortest);
	System.out.println(longest);
	//.out.println(len);
	}

}
