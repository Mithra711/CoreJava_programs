package corejava;

import java.util.Arrays;

public class binary_search {

	public static void main(String[] args) {

		// Conditions:- 1) key=mid
		//              2) key<mid => low=mid-1
		//              3) Key>mid => high=mid+1

	//	int a[] = {1,2,3,4,5}; //  shoulfd be in sorting order 

	/*	boolean status = false;
		int key = 3;
		int low=0;
		int high=a.length-1;

		while(low<=high)
		{
			int middle =(low+high)/2;

			if(a[middle] ==key) 
			{
				System.out.println("element found");
				status=true;
				break;
			}

			if(a[middle]<key) 
			{
				low=middle-1;
			}
			if(a[middle]>key) 
			{
				high =middle+1;
			}


		}
		if(status==false)
		{
			System.out.println("element not found");
		}


		
*/       // Type -2
		int a[] = {10,22,33,44,55,66,77,88,99,12};
		
		int key_search=88;
		
		int position=(Arrays.binarySearch(a, key_search));
		
		System.out.println(position);
		
		int exactposition=a[position];
	
		
		
		
		for(int i=0;i<=a.length-1;i++)
		{
			
			if(exactposition==a[i])
			{
				System.out.println(a[i]);
				
				
			}
		}
		
		
		}

}
