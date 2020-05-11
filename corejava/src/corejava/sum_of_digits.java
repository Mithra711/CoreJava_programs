package corejava;

import java.util.Scanner;

public class sum_of_digits {

	public static void main(String[] args) {

	//	1+2+3+4+5=15
		
		int sum=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Number : ");
		int num=sc.nextInt(); 
		
		while(num>0)  		{
			sum=sum+num%10;  
			num=num/10;
			
		}
		System.out.println(sum);
		
				
				
	}

}
