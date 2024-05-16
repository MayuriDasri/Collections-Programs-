//Write a Java program to increase an array list size.

package CollectionPrograms;

import java.util.ArrayList;
import java.util.List;

public class IncreaseArrayListSize {

	public static void main(String[] args) 
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.addAll(List.of(1,2,3,4,5));
		System.out.println("Orignal List : "+list);
		
		System.out.println("Size of list "+list.size());
		
		list.ensureCapacity(5);
		list.addAll(list.indexOf(4), list);
		
		System.out.println("list after adding capacity: "+list.size());
		
		
		

	}

}
