//Add Element At Particular Position 


package CollectionPrograms;

import java.util.ArrayList;
import java.util.List;

public class AddElementAtParticularPositionInArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		list.add(500);
		
		System.out.println("Original List Size : "+list.size());
		System.out.println("List Before adding elements from 4th position");
		list.forEach(ele->System.out.println(ele));
		
		 
		list.addAll(4, List.of(10,20,30,40,50));
		
		System.out.println("Updated List Size : "+list.size());
		System.out.println("List after adding elements from 4th position");
		list.forEach(ele->System.out.println(ele));
		
		
		
	}

}
