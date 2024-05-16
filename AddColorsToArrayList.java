//1.	Write a Java program to create an array list, add some colors (strings) and 
//print out the collection
package CollectionPrograms;

import java.util.ArrayList;

import java.util.List;

public class AddColorsToArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Red");
		list.add("Blue");
		
		list.addAll(List.of("Yellow","Green"));
		
		System.out.println(list);
		
		for(String str : list)
		{
			System.out.println(str);
		}
		
	}

}
