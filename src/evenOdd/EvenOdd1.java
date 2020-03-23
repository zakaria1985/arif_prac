package evenOdd;

public class EvenOdd1 {

	public static void main(String[] args) {
		 int[] num = {1,3,8,4,6,7};
		 
		 for(int i=0;i<num.length;i++) {
			 if(num[i]%2==0) {
				 
				 System.out.print(" "+num[i]);
			 }
			 
		 }
		
		 for(int i=0;i<num.length;i++) {
			 if(num[i]%2==1) {
				 System.out.print(" "+num[i]);
			 }
		 }
		
	}

}
