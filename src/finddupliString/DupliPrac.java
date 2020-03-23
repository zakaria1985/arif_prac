package finddupliString;

public class DupliPrac {

	public static void main(String[] args) {
		String st = "sillyspider";
		String []split = st.split("");
		
		for (int i=0;i<split.length; i++) {
			for(int j= i+1; j<split.length;j++) {
				
				if(split[i].equals(split[j])) {
					System.out.println(" "+split[j]);
					
				}
				
			}
			
			
		}
		
	}

}
