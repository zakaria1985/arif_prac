package practice;

public class FindDuplicatString {

	public static void main(String[] args) {
		String st = "ayra and liyana ayra are playing are ";
		
		System.out.println(st.length());
		
		String [] name = st.split(" ");
		
		System.out.println(name.length);
		
		for (int i =0; i<name.length;i++) {
			for (int j=i+1; j<name.length; j++) {
				if(name[i].equals(name[j])) {
					
					System.out.println(name[i]);
					
				}
			}
		}

	}

}
