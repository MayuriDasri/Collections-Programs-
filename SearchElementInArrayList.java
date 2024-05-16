//7.Write a Java program to search for an element in an array list.
package CollectionPrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SearchElementInArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		list.addAll(List.of(11,1,15,17,2,8,10,4,3,9,6,5,7,12,16,19,20));
		
		System.out.println("Original List:");
		System.out.println(list);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element to be search :");
		int search = sc.nextInt();
		sc.close();
		int flag = 0;
		
		for (int i=0;i<list.size();i++)
		{
			if(search == list.get(i))
			{
				flag = 1;
				break;
			}
		}
		
		if(flag == 1)
			System.out.println("The element found");
		else
			System.out.println("The element not found");
		}
}
