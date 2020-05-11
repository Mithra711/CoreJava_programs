package corejava;

public class largest_number {

	public static void main(String[] args) {
		
	/*//	int a=10,b=20;
		
		if(a>b)
		{
			System.out.println("a is greatrer");
		}
		else
		{
			System.out.println("b is grater");
		}
		*/
		
		/*a>b &a>c --> a is grater
		
		b>a & b>c  --> b is grater
		
		c>a & c>b --> c is grster*/

		
		/*int a=10,b=20, c=30;
		
		if(a>b && a>c)
		{
			System.out.println("a is greater :"+ a);
		}
		else if(b>a & b>c)
		{
			System.out.println("b is greater :" +b);
		}
		else
		{
			System.out.println("c is grater :" +c);
		}*/
		
		// ternary oparators(?)
		
		/*int a=10,b=20, c=30;
		
		int largest=a>b ? a:b;
		
		int largest1=c>largest ? c:b;
		
		System.out.println(largest1);*/
		
		int a=10,b=20, c=30;
		
		int largest=c>(a>b ? a:b) ? c:(a>b ? a:b);
		
		
		
	
		

	}

}
