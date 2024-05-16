//9.	Write a Java program to copy one array list into another.

package CollectionPrograms;

import java.util.ArrayList;
import java.util.List;

public class CopyOneArrayListIntoAnother {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		list.addAll(List.of(1,2,3,4,5,6,7,8,9,10));
		System.out.println("Original List");
		System.out.println(list);
		
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.addAll(list);
		System.out.println("Copied List");
		System.out.println(list1);
		
	}

}
