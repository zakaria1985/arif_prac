package longAndShort;

public class FindLargeandShort {

	public static void main(String[] args) {
	 String st = "we are studing in burger king";
	 String [] text = st.split(" ");
	 
	 String longest = "";
	 String shortest = text[0];
	 
	 for(String x:text) {
		 if(x.length()>longest.length()) {
			 longest=x;
	
			
		 }
	 
 
	 else if(x.length()<shortest.length()) {
			 shortest=x;
		 
	 }
System.out.println("longestword>>>>>>>>>>>"+longest);

System.out.println("shortest word>>>>>>>>>>"+shortest);
	}



}}
