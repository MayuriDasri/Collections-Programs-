//Write a Java program that swaps two elements in an array list.

package CollectionPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SwapElementInArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.addAll(List.of(11,12,13,14,15,16,17,18,19,20));
		System.out.println("Original List :"+list);
		
		Collections.swap(list, 2, 8);
		System.out.println("List after Swapping Element :"+list);
		

	}

}
