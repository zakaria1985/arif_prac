package longAndShort;

public class LongShort1 {

	public static void main(String[] args) {
		String st ="hellow people in beautiful morning ";
		String[] word = st.split(" ");
		
		String longest =word [0];
		
		String shortest =word[0];
		String secLong = word[0];
		for (String x:word) {
			
			if(x.length()>longest.length()) {
				secLong =longest;
				longest=x;
			}
			else if(x.length()>secLong.length()) {
				 secLong = x;
			}
			
			else if(x.length()<shortest.length()) {
				shortest = x;
			}
		}
   System.out.println("longest word =====          "+ longest);
   System.out.println("seclong word =====          "+ secLong);
   System.out.println("shortest  word=========      "+ shortest);
	}

}
