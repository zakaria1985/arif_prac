package plainDorm;

public class TextPlaindorm {

	public static void main(String[] args) {
		String st = "non";
		String[] text =st.split("");
		String rev= "";
		for(int i =text.length-1;i>=0;i--) {
			rev= rev+text[i];
		}
System.out.println(rev);
if (rev.equals(st)) {
	System.out.println(rev+"  ="+"this is plaindorm");
}else {
	
	System.out.println("it is not plaindorm"+ " "+rev);
}
	}

}
