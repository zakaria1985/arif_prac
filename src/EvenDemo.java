import java.util.Scanner;

public class EvenDemo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println(" enter first nember");
		int num1 = input.nextInt();
		System.out.println(" enter second nember");
		int num2 = input.nextInt();
		
		for ( int i = num1; i <= num2; i++) {
			
			if(i%2!=0) {
				System.out.println(i);
			}
			
		}
	}

}
