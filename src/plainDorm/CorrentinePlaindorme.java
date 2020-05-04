package plainDorm;

public class CorrentinePlaindorme {

	public static void main(String[] args) {
		String st = "corentine";
		String [] text =st.split("");
		String rev = "";
		
	for(int i=text.length-1; i>=0;i--) {
		rev = rev+text[i];
	}
	
	if (rev.equalsIgnoreCase(st)) {
		System.out.println("this is an plaindoreme");
	}
	System.out.println("this is not a plaindorme");
	}

}
