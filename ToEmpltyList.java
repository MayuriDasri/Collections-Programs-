//Write a Java program to empty an array list.
package CollectionPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ToEmpltyList {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.addAll(List.of(1,2,3,4,5));
		System.out.println("List 1 : "+list);
		
		list.clear();
		System.out.println("List 1 after making empty :"+list);
		
		List<Object> list1 = Collections.emptyList();
		System.out.println("List 1 After Making Empty : "+list1);
		

	}

}
