package longAndShort;

public class FindLongShort2 {

	public static void main(String[] args) {
		
		
		String t ="everypeople living under poverty";
		String []text =t.split(" ");
		
		String longest = text[0];
		String sec = text[0];
		String shortest = text[0];
		
		
		for(String x:text) {
			
			if(x.length()>longest.length()) {
				
				sec =longest;
				
				longest=x;
			}
			
			else if(x.length()> sec.length()) {
				sec =x;
				
			}
			
			else if(x.length()<shortest.length()) {
				shortest= x;
			}
		}
		System.out.println("long=="+ longest);
		System.out.println("secLong....."+ sec);
		System.out.println("short==="+ shortest);
	}

}
