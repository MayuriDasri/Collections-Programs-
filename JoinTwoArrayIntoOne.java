//Write a Java program to join two array lists.

package CollectionPrograms;

import java.util.ArrayList;
import java.util.List;

public class JoinTwoArrayIntoOne {

	public static void main(String[] args) {
		
		ArrayList<String> list1 = new ArrayList<String>();
		list1.addAll(List.of("A","B","C","D","E"));
		System.out.println("List 1 : "+list1);
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.addAll(List.of("F","G","H","I","J"));
		System.out.println("List 2 : "+list2);
		
//		Collections.copy(list1, list2);
//		System.out.println("List1 after Copying : "+list1);
//		System.out.println("List2 after Copying : "+list2);
		
		ArrayList<String> list3 = new ArrayList<String>();
		list3.addAll(list1);
		list3.addAll(list2);
		System.out.println("After Adding List 1 and List 2 to List 3 :  "+list3);
	}

}
