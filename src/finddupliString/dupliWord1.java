package finddupliString;

public class dupliWord1 {

	public static void main(String[] args) {
		String word = " ayara  promi liyana motin promi ibrahim ";
		String []st = word.split(" ");
		
		for(int i =0; i<st.length; i++) {
			for(int j=i+1; j<st.length;j++) {
				if(st[i].equals(st[j])) {
					System.out.println(st[j]);
				}
			}
		}
		
	}

}
