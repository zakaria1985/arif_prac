package evenOdd;

public class CorOddEven {

	public static void main(String[] args) {
		int [] num = {2,8,7,9,5};
		
		System.out.println("even number");
		
		for(int i =0; i<num.length;i++) {
			if(num[i]%2 == 0) {
				System.out.print(" "+num[i]);
				
			}
		}
		System.out.println();
 System.out.println("odd number");
  for(int i=0; i<num.length;i++) {
	 if(num[i]%2 ==1) {
		 System.out.print(" "+num[i]);
	 }
 }
	}

}
