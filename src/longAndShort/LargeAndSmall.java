package longAndShort;

public class LargeAndSmall {

	public static void main(String[] args) {
		String st = "ayra is the best";
		String [] word =st.split(" ");
		
		String largest = word[0];
		String shortest= word[0];
		
		for(int i =0; i<word.length;i ++) {
			if (word[i].length()>largest.length()) {
				largest =word[i];
			}
			else if(word[i].length()<shortest.length()) {
				shortest =word[i];
			}
		}
System.out.println("large.....    "+largest);
System.out.println("shortest>>>>>>>>>>>>>>.  "+ shortest);
	}

}
