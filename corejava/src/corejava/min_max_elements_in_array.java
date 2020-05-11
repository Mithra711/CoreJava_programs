package corejava;

public class min_max_elements_in_array {

	public static void main(String[] args) {
		
		int a[]={12,45,90,76};
		
		
		int max=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("maximum value in array is :" + max);
		
		int min=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("minimum value in array is :" + min);

	}

}
