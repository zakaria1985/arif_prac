package evenOdd;

public class EvenAndOdd {

	public static void main(String[] args) {
		int []a = {1,5,6,8};
		
	
		System.out.println("even");
		for (int i =0;i<a.length; i++) {
			if(a[i]%2 == 0) {
				
				System.out.print(" "+ a[i]);
				
				
			}
		}
		System.out.println();
		System.out.println("odd");
			for (int j =0;j<a.length; j++) {
			 if(a[j]%2== 1) {
				System.out.print(" "+a[j]);
				
			}
			}
		
		
	}

}
