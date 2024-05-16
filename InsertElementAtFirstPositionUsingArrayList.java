//3.Write a Java program to insert an element into the array list at the first position.

package CollectionPrograms;

import java.util.ArrayList;
import java.util.List;

public class InsertElementAtFirstPositionUsingArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.addAll(List.of(20,30,40,50));
		
		//Printing using for each by assigning element
		list.forEach((ele)->{System.out.println(ele);});
		System.out.println("----------------------");
		
		//printing using for each by directly list
		list.forEach(ele->System.out.println(list));
		System.out.println("----------------------");
		
		
		list.add(0, 10);
		System.out.println("List After Adding element at First Position ");
		list.forEach(ele->System.out.println(ele));
		System.out.println("----------------------");
		
		list.add(4, 80);
		System.out.println("List After Adding element at Eight Position ");
		list.forEach(ele->System.out.println(ele));
		System.out.println("----------------------");
		
	}

}
