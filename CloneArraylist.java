//Write a Java program to clone an array list to another array list.
package CollectionPrograms;

import java.util.ArrayList;
import java.util.List;

public class CloneArraylist {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		ArrayList<Integer> list1  = new ArrayList<Integer>();
		list1.addAll(List.of(1,2,3,4,5));
		System.out.println("Original List : "+list1);
		
		ArrayList<Integer>list2 = (ArrayList<Integer>)list1.clone();
		System.out.println("Clone List : "+list2);

	}

}
