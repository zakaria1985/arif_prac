package array;

import java.util.HashMap;
import java.util.Map;

public class SingleArray {

	public static void main(String[] args) {
		
		int [] num = new int[3];
		num[0]=10;
		num[1]=15;
		num[2]=20;
		
		System.out.println(num[1]);
		
		int [][] number = new int [3] [2] ;
		Map <Integer,String> map = new HashMap <Integer, String>();
		map.put(1, "motin");
		map.put(2, "ayara");
		
		System.out.println(map.get("motin"));

	}

}
