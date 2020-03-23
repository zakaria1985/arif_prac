package longAndShort;

public class LargeAndS {

	public static void main(String[] args) {
	String st = "love lover lovely";
	String [] word = st.split(" ");
	
	String largest ="";
	String shortest= word[0];
	String secLar ="";
	
	for(String x:word) {
		if(largest.length()<x.length()) {
			secLar = largest;
			largest =x;
		}
		
		else if(secLar.length()<x.length()) {
			secLar =x;
			
		}
		else if(shortest.length()>x.length()) {
			shortest =x;
		}
	}
	
	System.out.println(largest);
	System.out.println(secLar);
    System.out.println(shortest);
	}

}
