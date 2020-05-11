package corejava;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class sorting_elements_in_array {

	public static void main(String[] args) {
		
		Integer a[] = {1,4,7,9,56,4,77,5,8,10}; 
		// type - 1
		/*System.out.println("before sorting " +Arrays.toString(a));
		
		Arrays.parallelSort(a);
		
		System.out.println("after sorting " +Arrays.toString(a));*/
		
		// type - 2  ascending order
		/*System.out.println("before sorting " +Arrays.toString(a));
		
		Arrays.sort(a);
		
		System.out.println("after sorting " +Arrays.toString(a));*/
		
		// type -3  descending order
		
         System.out.println("before sorting " +Arrays.toString(a));
		
		Arrays.sort(a,Collections.reverseOrder());
		
		System.out.println("after sorting " +Arrays.toString(a));
		
		
		

	}

}
