package riverseText;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> text = new ArrayList<String>();
		
		text.add(" zakaria");
		text.add("arif");
		text.add("tusar");
		text.add("liton");
		
		// int  size =text.size();
		
		
		 text.add(1, "motin");
		 System.out.println(text);
		 
		  String s =text.get(2);
		  System.out.println(s);
		    int i =text.indexOf("liton");
		    System.out.println(i);
		    String r= text.remove(3);
		    System.out.println(r);
		    
		    
		//for(String x:text) {
			//System.out.print(" "+x);
		//}
		//System.out.println();
		//System.out.println(size);
	}


}
