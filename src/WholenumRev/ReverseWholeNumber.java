package WholenumRev;

import java.util.Scanner;

public class ReverseWholeNumber {

	public static void main(String[] args) {
	Scanner scaner = new Scanner(System.in);
	int num =scaner.nextInt();
	
	int reminder, temp;
	int rev =0;
	temp=num;
	
	
	while(temp != 0){
		reminder =temp%10;
		rev=(rev*10)+reminder;
		temp= temp/10;
		
		
	}
	System.out.println("riverse the whole number"+ rev);	
	
	
	if(rev==num) {
		System.out.println("this is palindrome");
	}
	else {
		System.out.println("this not palindorme ");
	}

	}

}
