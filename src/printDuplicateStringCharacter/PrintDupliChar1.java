package printDuplicateStringCharacter;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class PrintDupliChar1 {
	
	public static void main(String[] args) {
		
		String st = "SILLYSPIDERS";
		char[] cr = st.toCharArray();
		       int size =cr.length;
		       
		   Map<Character, Integer> name = new HashMap<>();
		   int i =0;
		   while(i != size){
			   if (name.containsKey(cr[i])== false) {
				   name.put(cr[i], 1);
				   
			   }
			   else {
				   
				  int gold= name.get(cr[i]);
				  int dimond = gold+1;
				  name.put(cr[i], dimond);
			   }
			   ++i;
		   }
		     Set<Map.Entry<Character,Integer>> entryMap = name.entrySet();
		     for (Map.Entry<Character,Integer>x:entryMap) {
		    	 if(x.getValue()>1) {
		    		 
		    		 System.out.print(x.getKey());
		    		
		    		 System.out.println(x.getValue());
		    	 }
		     }
		
	}
}
