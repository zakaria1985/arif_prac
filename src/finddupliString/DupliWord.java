package finddupliString;

public class DupliWord {

	public static void main(String[] args) {
		String name = "SILLYSPIDER PR PR";
		String []split =name.split(" ");
		
		for(int i=0; i<split.length; i++) {
			for(int j=i+1; j<split.length;j++) {
				
				if(split[i].equals(split[j])) {
					System.out.print(" "+split[j]);
				}
			}
		}

	}

}