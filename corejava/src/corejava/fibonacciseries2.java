package corejava;

public class fibonacciseries2 {

	public static void main(String[] args) {
		
		// type 1:
		/*int f=0,s=1;
		int t=f+s;
		for (int i=0; i<=20;  i++)
		{
			System.out.println(f);
			t=f+s;
			f=s;
			s=t;
			
			if(f==78)
			{
				break;
			} 

	}
*/		
		// type 2:
		
		int n1=0,n2=1,sum=0;
		
		System.out.print(n1+ " "+ n2);
		
		for(int i=2;i<10;i++)
		{
			sum=n1+n2;           // 0+1
			System.out.print(" " +sum);
			n1=n2;              //  n1=1
			n2=sum;             //   n2=1
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}