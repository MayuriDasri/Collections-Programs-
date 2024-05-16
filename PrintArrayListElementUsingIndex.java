package CollectionPrograms;

import java.util.ArrayList;
import java.util.List;

public class PrintArrayListElementUsingIndex {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.addAll(List.of(1,2,3,4,5));
		
		System.out.println("Original List :"+list);
		
		int size = list.size();
		
		System.out.println("-------------------------------------");
		System.out.println("List using for each");
		try
		{
			for(Integer e : list)
			{
				System.out.println(list.get(e));
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Size Matters : "+e);
		}
		
		System.out.println("-------------------------------------");
		System.out.println("List using for loop");
		for(int i=0;i<=size;i++)
		{
			System.out.println(list.get(i));
		}

	}

}
