package CollectionPrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.addAll(List.of(10,20,30));
		
		list.forEach(element->System.out.println(element));
		System.out.println("-------------");
		
		ListIterator<Integer> itr = list.listIterator(list.size());
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous());
		}
	}

}
