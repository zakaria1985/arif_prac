
public class ArrayPrac {

	public static void main(String[] args) {
		int sum =0;
		int[]num= new int [5] ;
		num[0]= 10;
		num[1] = 20;
		num[2] =40;
		num[3]= 50;
		num [4]= 60;
		
		
		for( int i =0 ; i<5; i++) {
			
			sum = sum + num [i];
			//sum = sum + i;

		}
		System.out.println(sum);
	}
		
	//int sum = num[0]+ num[1]+num[2]+num[3]+num[4];
	//int sum2 = (num[1]+ num[4]) - (num [0]+ num[2]) ;
	//int lentch = num.length;
	
	
	///System.out.println(sum);
	//System.out.println(sum2);
	//System.out.println(lentch);

}

