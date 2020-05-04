package finddupliString;

public class Condupli {

	public static void main(String[] args) {
		String st = "lovlylovly";
		String []text =st.split("");
 for(int i =0; i<text.length;i++) {
	 for(int j =i+1; j<text.length; j++) {
		 
	if(text[i].equals(text[j])) {
		System.out.print(" "+ text[j]);
	}
 }
 }
 
	}

}
