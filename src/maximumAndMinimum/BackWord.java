package maximumAndMinimum;

public class BackWord {
	public static void main (String[]args) {
		String st = "we are group";
		String [] text = st.split("");
		
		String rev= "";
		for(int i= text.length-1;i>0; i--) {
			
			  rev = rev+text[i];
		}
		System.out.print("reverse String =====   "+ rev);
	}

}
