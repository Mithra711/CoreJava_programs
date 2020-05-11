
package corejava;

import java.util.Scanner;

public class Factorial_number {

	public static void main(String[] args) {
		
		
		
		/*int num=10;
		
		int sum=1;*/
		
		// 1*2*3*4*5*6*7*8*9*10=
		
		/*for(int i=1;i<=10;i++)
		{
			sum=sum*i;
		}
		System.out.println(sum);*/ 
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your factorial number : ");
		int b=sc.nextInt();
		
		
		
		int sum=1;
		
		/*for(int i=1;i<=10;i++)
		{
			sum=sum*i;
		}
		System.out.println(sum);*/
		
		
		for(int i=b;i>1;i--)
		{
			sum=sum*i;
		}
		System.out.println(sum);
		

	}

}
