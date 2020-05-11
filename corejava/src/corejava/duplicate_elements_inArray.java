package corejava;

import java.util.HashSet;

public class duplicate_elements_inArray {

	
	public static void main(String[] args) {
		
		/*boolean status=false;
		
		String a[] = {"java","c","c++","python","c#","PHP"};
		
	for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println(" duplicate value is : " +a[i]);
					status=true;
				}
				
			}
		}
	if(status==false)
	{
		System.out.println("no duplicate value");
	}*/
		
       /*boolean status=false;*/
		
		String a[] = {"java","c","java","c++","python","c#","PHP"};
		
		HashSet<String> hash =new HashSet();
		
		/*System.out.println(hash.add(a[0]));
		System.out.println(hash.add(a[1]));
		System.out.println(hash.add(a[2]));*/
		
		for (String bhuvi : hash) 
		{
			if(hash.add(bhuvi)==false)
			{
				System.out.println("duplicate value :" +bhuvi);
			}
			
		}
		
		/*for(a)
		{
			if(hash.add(a[i])==false)
			{
				System.out.println("duplicate value :"+i);
			}
		}*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
