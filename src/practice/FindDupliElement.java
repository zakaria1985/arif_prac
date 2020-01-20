package practice;

public class FindDupliElement {

	public static void main(String[] args) {
		String [] dupliElement = {"motin","arif","tusar","liton","liton"};
		
		for(int i = 0; i<dupliElement.length;i++ ) {
			
			for (int j = i+1; j<dupliElement.length;j++) {
				
				if (dupliElement [i].equals(dupliElement[j])) {
					System.out.println(dupliElement [j]);
				}
				
			}
		}

		}
	
	
		
}
