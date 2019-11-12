package riverseText;

public class RiverseDemo1 {

	public static void main(String[] args) {
		String text =" we are confident";
		String  empty  = " ";
		  String [] st =text.split("");
		  
		  for( int i= text.length()-1; i>=0; i--) {
			  empty = empty+st[i];
		  }
		  System.out.println(empty);
	}

}