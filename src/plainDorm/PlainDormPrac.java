package plainDorm;

public class PlainDormPrac {

	public static void main(String[] args) {
	String st = "ana";
	String [] name = st.split("");
	
	String rev = "";
	
	
	for (int i = name.length-1;i>=0; i--) {
		rev= rev+name[i];
		
		
	}
	
	System.out.println(rev);
	if(rev.equalsIgnoreCase(st)) {
		
		System.out.println("this is plandorm"+ "  "+rev);
		
	}
	else {
		System.out.println("this is not plaindorm"+ "  "+rev);
	}
	
	}

}
