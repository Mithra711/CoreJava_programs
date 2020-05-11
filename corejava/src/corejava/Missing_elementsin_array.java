package corejava;

public class Missing_elementsin_array {

	public static void main(String[] args) {
		
		int a[]={1,2,4,5};
		
		/*a[0]=1
		a[1]=2		
		*/
		int sum1=0;
		
		for(int i=0;i<a.length;i++)
		{
			sum1=sum1+a[i];
		}
		System.out.println("sum of array elements :"+sum1);
		
	int sum2=0;
		
		for(int i=0;i<=5;i++)
		{
			
			sum2=sum2+i;
		}
		System.out.println("total value of an array : "+sum2);
		System.out.println("missing value of array is : "+(sum2-sum1));
	}
	
	

}
