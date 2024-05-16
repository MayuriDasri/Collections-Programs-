//Write a Java program to compare two array lists.

package CollectionPrograms;

import java.util.ArrayList;
import java.util.List;

public class CompareTwoArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.addAll(List.of(1,2,3,4,5));
		System.out.println("List 1 : "+list1);
		
		System.out.println("--------------------------------------");
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.addAll(List.of(6,7,1,3,9,10));
		System.out.println("List 2 : "+list2);
		
		
		System.out.println("--------------------------------------");
		ArrayList<Integer> list3 = new ArrayList<Integer>();
        for (Integer e : list1)
           {
        	if(list2.contains(e))
        	{
        		list3.add(e);
        	}
           }
        System.out.println("List 3 : "+list3);

		
		

	}

}
