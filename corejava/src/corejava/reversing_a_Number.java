package corejava;

import java.util.Scanner;

public class reversing_a_Number {

	public static void main(String[] args) {
		
		
		/*int a=1234,b=10;
		
		int c=a%b;  remainder
		System.out.println(c); 
		
		int d=a/b;   qoutient
		System.out.println(d);*/ 
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your Number :  ");
		
		
		int num=sc.nextInt();
		// logic :- 1
		/*int rev=0;
		
		while(num!=0)
		{
			rev =rev*10+num%10;   //  432
			num=num/10;         // 1
		}
		
		System.out.println(rev);*/
		
		/*
		// logic :-2
		StringBuffer sb=new StringBuffer(String.valueOf(num));
		StringBuffer rev=	sb.reverse();
		System.out.println(rev);
*/
		
		// logic :-3
		
		StringBuilder sb=new StringBuilder(String.valueOf(num));
		StringBuilder	rev=	sb.reverse();
		System.out.println(rev);
		

	}

}
