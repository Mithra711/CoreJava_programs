package corejava;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner scan =new Scanner(System.in);
	System.out.println("Enter the Value : ");
    String value =scan.next();
    
    String original=value;
   int len= value.length();
   
  String rev="";
    
    
    for(int i=len-1;i>=0;i--)
	{
		rev=rev+value.charAt(i);
	}
 
   
   System.out.println(value);

   if(original.equals(value))
   {
	   System.out.println("palindrome");
	   
   }
   else 
   {
	   System.out.println("Not a palindrome");
   }
   
	}

}

