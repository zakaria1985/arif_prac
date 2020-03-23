package longAndShort;

public class findLageAnaShort1 {

	public static void main(String[] args) {
		String s = "lets have paicnic inside is jang";
		String [] split = s.split(" ");
		
		String largeWord ="";
		String shortWord  =split[0];
		String secondLarge = split[0];
		String thirdLarge = split[0];
		
		
		for (String x:split) {
			if (x.length()>largeWord.length()) {
				thirdLarge =secondLarge;
				secondLarge =largeWord;
				largeWord =x;
				
				}
			else if(x.length()>secondLarge.length()) {
				secondLarge =x;
				
			}
			else if(x.length()>thirdLarge.length()) {
				thirdLarge =x;
			}
			
		 else if (x.length()<shortWord.length()) {
			 shortWord=x;
		 }
			
		}
		
		System.out.println(largeWord);
		System.out.println(secondLarge);
		System.out.println(thirdLarge);
		System.out.println(shortWord);

	}

}
