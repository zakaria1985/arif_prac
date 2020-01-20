package riverseText;

public class ReverseAgain {

	public static void main(String[] args) {
	String st ="we are happy";
	String []text=st.split("");
	String empty="";
	
	for(int i=text.length-1;i>=0; i--) {
		empty =empty+text[i];
	}
System.out.println(empty);
	}

}
