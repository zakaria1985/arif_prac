package finddupliString;

public class FindDupli {

	public static void main(String[] args) {
	
		String st= "ayra promi liyana ayra  promi";
		
		
		
		 String [] text =st.split(" ");
		  
		
		 
		  for(int i= 0;i<text.length;i++) { 
			  for(int j =i+1;j<text.length;j++) {
		  if(text[i].equals(text[j])) {
		 
			  
		  
		 // System.out.println(text[i]);
		  System.out.println(text[j]);
		  
		  }
		  
		  
		  }
		
	}
	}
}
