//Write a Java program for trimming the capacity of an array list.
package CollectionPrograms;

import java.util.ArrayList;
import java.util.List;

public class TrimmingArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.addAll(List.of(1,2,3,4,5));
		System.out.println("Original List : "+list);
		System.out.println("Orignal size of list : "+list.size());
		
		list.add(null);
		list.add(null);
		list.add(null);
		System.out.println("List after adding three null element : "+list.size());
		
		list.trimToSize();
		System.out.println("Size of list after triming :"+list.size());

	}

}
