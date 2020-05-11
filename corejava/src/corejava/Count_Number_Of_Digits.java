package corejava;

import java.util.Scanner;

public class Count_Number_Of_Digits {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Number : ");
		int num=sc.nextInt(); 
		
	
		
		
	 int count=0; 	//2
	 
	 while(num>0) 	// 1234>0
	 {
		 num=num/10;  	//12/10
		 count++;
		 
	 }
	 System.out.println(count);

	}

}
