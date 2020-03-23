package riverseText;

public class Ragain {

	public  static void main(String[] args) {
		String name ="madam";
		String [] text =name.split("");
		String rev="";
		for (int i=text.length-1; i>=0; i--) {
			rev= rev+text[i];
		}
		
		System.out.println(rev);
		
		if(rev.equalsIgnoreCase(name)) {
			System.out.println("this is a palindorme");
		}
		else {
			System.out.println("this is not plaindorme");
		}
	}

}
