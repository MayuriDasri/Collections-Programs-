//Write a Java program to extract a portion of an array list.

package CollectionPrograms;

import java.util.ArrayList;
import java.util.List;

public class ExtractPortionFromArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.addAll(List.of(1,2,3,4,5,6,7,8,9,10));
		System.out.println("Original List : "+list);
		
		list.trimToSize();
		System.out.println("List after using trimToSize() Method"+list);
		
		 List<Integer> subList = list.subList(0, 5);
		 System.out.println("Sub list after using subList() :"+subList);
		 
		

	}

}
