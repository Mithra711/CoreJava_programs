package corejava;

import java.util.HashSet;

public class Hashset_using_duplicate_value {

	public static void main(String[] args) {
		
		boolean status=true;
		
     String a[] = {"java","c","c++","python","c#","PHP"};
		
		HashSet<String> hash =new HashSet();
		
		/*System.out.println(hash.add(a[0]));
		System.out.println(hash.add(a[1]));
		System.out.println(hash.add(a[2]));*/
		
		for (String bhuvi : a) 
		{
			if(hash.add(bhuvi)==false)
			{   
				System.out.println("duplicate value :" +bhuvi);
				status=false;
			}
			
		}
		
		if(status==true)
		{
			System.out.println("no duplicate value");
		}

	}

}
