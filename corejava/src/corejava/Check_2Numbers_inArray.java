package corejava;

import java.util.Arrays;

public class Check_2Numbers_inArray {

	public static void main(String[] args) {
		
		
//		type 1 :own logic
		 
		/*int a1[]={1,2,3,7,5};
		int a2[]={1,2,3,4,5};

		
		boolean status=true;
		
		if(a1.length == a2.length)   // 5=5
		{
			for(int i=0;i<a1.length;i++)  
			{
				if(a1[i] != a2[i])
				{
					status=false;
					
				}
			}
		}
		else
		{
			status=false;
		} 
		
		if(status==true)
		{
			System.out.println("Array is equal ");
		}
		else
		{
			System.out.println("Array is not equal");
		}
*/
		
		int a1[]={1,2,3,4,5};
		int a2[]={1,2,3,4,5};
		
	boolean boo=	Arrays.equals(a1, a2);
	
	if(boo==true)
	{
		System.out.println("equals");
	}
	else
	{
		
			System.out.println("not equals");
		
	}
	
		
		
		
	}
	

}
