package plainDorm;

public class PlainDormDemo {
	public static void main(String[]args) {
		
		String name ="loln";
		String[] text= name.split("");
		
		String rev="";
		
		for(int i=text.length-1;i>=0;i--) {
			rev =rev+text[i];
			
			
		}
		if(rev.equals(name)) {
			System.out.println("this is plaindorm>>>"+ rev);
		}
		
		else {
			System.out.println("this is not plaindorm"+ rev);
		}
		
		
	}

}
