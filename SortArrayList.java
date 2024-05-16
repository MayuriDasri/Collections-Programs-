//Write a Java program to sort a given array list.
package CollectionPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		list.addAll(List.of(11,1,15,17,2,8,10,4,3,9,6,5,7,12,16,19,20));
		
		System.out.println("Original List:");
		System.out.println(list);
		
		Collections.sort(list);
		//add function comparator . 
		System.out.println("List After Sorting Element : ");
		System.out.println(list);


	}

}
