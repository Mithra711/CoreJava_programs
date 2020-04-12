package corejava;

public class fibonacciseries2 {

	public static void main(String[] args) {
		int f=0,s=1;
		int t=f+s;
		for (int i=0; i<=20;  i++)
		{
			System.out.println(f);
			t=f+s;
			f=s;
			s=t;
			
			if(f==1)
			{
				break;
			} 

	}
	}
}
