package corejava;

import java.util.Scanner;

public class reverse_a_string {

	public static void main(String[] args) {
		
       
	/*// Logic :-1	
		String str="WelcomE";
		String rev="";
		
		int len=str.length();
		
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
		
*/ 
	/*	// logic :-2
		String given = "mithra";
		StringBuffer bs= new StringBuffer(given);
		
		StringBuffer sb= bs.reverse();
		System.out.println(sb);
*/
	  // logic :- 3
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your String :");
		
		String str=	sc.next();
		
		String rev="";
		
		char a[]=str.toCharArray();
		
	int len=	a.length;
	
	for(int i=len-1;i>=0;i--)
	{
		rev=rev+a[i];
		
	}
	
	System.out.println(rev);
		
	
	}

}
