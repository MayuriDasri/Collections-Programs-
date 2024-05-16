package CollectionPrograms;

import java.util.ArrayList;
import java.util.List;

public class ReplaceArrayElementToSpecific {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.addAll(List.of(1,2,3,4,5));
		System.out.println("Original List : "+list);
		
		list.set(3,null);
		System.out.println("List after adding null element at 3rd position : "+list);
		
		list.set(4,55);
		System.out.println("List after adding 55 element at 5th position : "+list);
		
		

	}

}
