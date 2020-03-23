package finddupliString;

public class FindDupliString2 {

	public static void main(String[] args) {
		
		String sentence = "we use java as programming use language java";
		String[] word = sentence.split(" ");
		
	String rev = "";
		for (int i =0; i<word.length;i++) {
			
			for(int j =i+1; j<word.length; j++) {
				if (word[i].equals(word[j])) {
					System.out.println(word[j]);
				}
				
			}
		}

	}

}
