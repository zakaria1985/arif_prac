package receipts;

import java.text.DecimalFormat;

public class PrintMemo {
	
	private static  double apple = 1.00;
	private static double orange =2.00;
	private static double windex =4.99;
	private static double pepesi= 2.50;
	private static double candy= 0.95;
	
	
	public static DecimalFormat  df = new DecimalFormat("0.00");
	
	
	public static double appleTotal(int pound) {
		double total =apple*pound ;
		System.out.println("potato.............................."+pound+"................"+apple+"......"+total);
		return total;
		
	}
	public static double orangeTotal(int pound) {
	double total =orange*pound;
	System.out.println("orange.............................."+pound+"................"+orange+"......"+total);
	return total;
		
	}
	public static double windexTotal(int quantity) {
		double total =windex*quantity;
		System.out.println("windex.............................."+quantity+"................"+windex+"......"+total);
		return total;
	}
	
	public static double pepesiTotal(int quantity) {
		double total = pepesi*quantity;
		System.out.println("pepesi.............................."+quantity+"................"+pepesi+"......"+total);
		return total;
	}
	
	public static double cash(double cash) {
		return cash;
	}
	
	
	
	public static void main (String []args) {
		
		
		System.out.println("                   ZAKARIA & Daughter limited");
		System.out.println("                       3150, 78 street");
		System.out.println("                       woodside new york");
		System.out.println("                         646 436 8349");
		System.out.println("=============================================================");
		System.out.println("Iteam..............quantity/pound...........prize.............total ");
		System.out.println("_____________________________________________________________________");
		
		
		
		double taxAble=0.00;
		double nonTaxable =0.00;
		double taxRate = 0.0875;
		nonTaxable = appleTotal(5)+ orangeTotal(3);
		taxAble =  windexTotal(2)+pepesiTotal(3);
		
		double tax = taxAble*taxRate;
		double subTotal = taxAble+ nonTaxable;
		double total = subTotal+tax;
		System.out.println("subtotal-------------------------------------------------"+subTotal);
		if (tax>0) {
		System.out.println("tax------------------------------------------------------"+ tax);
		}
		System.out.println("total========================================================"+total);
		double cash = cash(120);
		System.out.println("cash................................................"+ cash);
		double balance = total- cash;
		if (balance<=0) {
			System.out.println("give changge....................................   "+ balance);
			System.out.println("thank for shopping with us");
		}
		else if(balance == 0) {
			System.out.println("give changge....................................   "+ balance);

		}else {
			System.out.println("take the ramaining balance...................................   "+ balance);

		}
		
	}

}
