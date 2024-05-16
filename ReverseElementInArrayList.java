package CollectionPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseElementInArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.addAll(List.of(1,2,3,4,5,6,7,8,9,10));
		System.out.println("Original List :"+list);
		
		Collections.reverse(list);
		System.out.println("List after Reversing Element: "+list);
		
		
		//2nd Method 
		 Integer arr[] = { 10, 20, 30, 40, 50 }; 
		 System.out.println("Original Array : "+Arrays.toString(arr)); 
		 Collections.reverse(Arrays.asList(arr)); 
		 System.out.println("Modified Array : "+ Arrays.toString(arr)); 
		
	}

}
