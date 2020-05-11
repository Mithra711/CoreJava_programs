package corejava;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class Genarate_number_and_String {

	public static void main(String[] args) {
		
	//	Random 1000 --->1 to 999
	//	         10----> 1to 9

	// Type - 1
		/*Random rand=new Random();
		
		int r=rand.nextInt(1000);
		System.out.println(r);*/
		
	/*// Type - 1.1	
		
		Random rand=new Random();
	double r=	rand.nextDouble();
	System.out.println(r);*/
		
	//	type 2: using math
		
	/*double	 math=Math.random();
	System.out.println(math);*/
		
	//	type 3 :
		
		String number=	RandomStringUtils.randomNumeric(10);
		System.out.println(number);
		
		String alpha=RandomStringUtils.randomAlphabetic(10);
		System.out.println(alpha);
		
		String both=RandomStringUtils.randomAlphanumeric(7);
		System.out.println(both);
		
		
		
		
		
	}


}
