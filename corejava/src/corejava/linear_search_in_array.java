package corejava;

public class linear_search_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean status = true;
		int a[] = {10,20,40,50,70,40,96};
		int search_element =77;
		
		for(int i=0;i<a.length-1;i++)
	{
			if(search_element==a[i]) 
			{
				System.out.println("element found :" +i);
				status=false;
			}
		
	
		}
		if(status==true)
		{
			System.out.println("no such elements in this array");
		}
	}

}
