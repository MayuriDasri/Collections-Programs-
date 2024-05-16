//Write a Java program to test whether an array list is empty or not.
package CollectionPrograms;

import java.util.ArrayList;
import java.util.List;

public class ToCheckListEmptyOrNot {

	public static void main(String[] args) {
	
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.addAll(List.of(1,2,3,4,5));
		System.out.println("Origianl List : "+list);
		
		if(list.isEmpty())
		{
			System.out.println("List is Empty");
		}
		else
		{
			System.out.println("List is not Empty");
		}
		
		System.out.println("After Clearing List");
		list.clear();
		if(list.isEmpty())
		{
			System.out.println("List is Empty");
		}
		else
		{
			System.out.println("List is not Empty");
		}
		

	}

}
