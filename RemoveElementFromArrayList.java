//6.Write a Java program to remove the third element from an array list.
package CollectionPrograms;

import java.util.ArrayList;
import java.util.List;

public class RemoveElementFromArrayList {

	public static void main(String[] args) {
		
		
		ArrayList<Character> list = new ArrayList<>();
		
		list.addAll(List.of('a','b','c','d','e','f','g','h'));
		System.out.println("Original List : ");
		list.forEach(ele->System.out.println(ele));
		
		
		list.remove(3-1);
		System.out.println("List After Removing 3rd Element");
		list.forEach(ele->System.out.println(ele));
	}

}
