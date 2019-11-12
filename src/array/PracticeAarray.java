package array;

import java.util.ArrayList;

public class PracticeAarray {

	public static void main(String[] args) {
		
		ArrayList <String> name  = new ArrayList <String>();
		
		name.add("ononnna");
		name.add("zack");
		name.add("promi");
		
		//System.out.println(name);
		
		 int value =name.indexOf("zack");
		 System.out.println(value);
		 System.out.println(name.size());
		
		
		for( String x : name) {
			
			System.out.println("name =" +x);
		}
		
	}

	
}
