package plainDorm;

public class CheckPalendorm {

	public static void main(String[] args) {
		
		String st = "madam";
		String []text =st.split("");
		
		String rev ="";
		for (int i =text.length-1; i>=0; i--) {
			 rev = rev+text[i];
		}
		
		if(rev.equals(st)) {
			System.out.println("this is palendorm");
		}
		else { 
			System.out.println("this is not palindorme");
		}
		
		System.out.println(rev);
	}

}
