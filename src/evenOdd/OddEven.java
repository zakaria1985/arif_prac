package evenOdd;

public class OddEven {

	public static void main(String[] args) {
		int [] num = {5,2,1,4,8,6};                           
		
		System.out.println("even number ");
		for(int i= 0; i<num.length;i++) {
			if(num[i]%2 == 0) {
				System.out.print(" "+ num[i]);
			}
		}
		
		System.out.println();
		System.out.println("odd number");
		
		for(int j=0; j<num.length; j++) {
			if(num[j]%2 ==1) {
				System.out.print(" "+num[j]);
			}
		}
	}

}
