package practice;

public class Reverse {

	public static void main(String[] args) {
		String st ="my name is motin";

		 String [] name = st.split("");
		 
		
		  String empty ="";
	
	 for ( int i = name.length-1; i>=0; i--) {
		  
		  empty = empty +name[i]; }
		  
		  System.out.println(empty);
		 
	}

}
