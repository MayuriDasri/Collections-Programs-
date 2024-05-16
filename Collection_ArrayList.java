package CollectionPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Collection_ArrayList {
	public static void main(String args[])
	{
		List<Integer> list = new ArrayList<>();
		list.add(30);
		list.add(40);
		list.add(10);
		list.add(20);
		list.add(50);
		
		System.out.println("Printing List using simple list");
		System.out.println(list);
		System.out.println("---------------------------");
		
		//using for loop
		System.out.println("Printing List using simple for loop");
		for(int i = 0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		System.out.println("---------------------------");
		
		//using for each
		System.out.println("Printing List using simple for each loop");
		for(int i : list)
		{
			System.out.println(i);
		}
		System.out.println("---------------------------");
		
		//printing using lambda expression
		System.out.println("Printing List using lambda expression");
		list.forEach((element)->{
			System.out.println(element);
		});
		System.out.println("---------------------------");
		
		//printing using hasNext()
		System.out.println("Printing List using Iterator");
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			
		}
		System.out.println("---------------------------");
		
		
		//Sorting array list
		System.out.println("Sorting Array");
		 Collections.sort(list);  
		 System.out.println(list);
		 System.out.println("---------------------------");
		 
	}
	

}
