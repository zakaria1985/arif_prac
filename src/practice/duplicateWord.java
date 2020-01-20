package practice;

public class duplicateWord {

	public static void main(String[] args) {
		String name = "my name is motin motin my";
		
		String []st =name.split(" ");
		
		for(int i = 0; i<st.length; i++) {
			
			for (int j= i+1;j<st.length;j++) {
				
				if(st[i].equals(st[j])) {
					System.out.println(st[j]);
				}
				
			}
			
		}
		
		

	}

}
