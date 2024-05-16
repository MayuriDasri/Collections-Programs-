//4.Write a Java program to retrieve an element (at a specified index) from a given array list.

package CollectionPrograms;

import java.util.ArrayList;
import java.util.Scanner;

public class RetriveElementFromSepecificIndexFromArrayList {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array List Size");
		int userSize = sc.nextInt();
		
		
		ArrayList<Integer> list = new ArrayList<>();
		
		System.out.println("Enter the Array list ");
		for(int i =0;i<userSize;i++)
		{
			int listElement = sc.nextInt();
			list.add(listElement);
		}
		
		System.out.println("List After Adding Elements : ");
		list.forEach(ele->System.out.println(ele));
		
		System.out.println("Enter the index of element which want to print : ");
		int index = sc.nextInt();
		System.out.println("The "+index+" Element is : "+list.get(index-1));

		sc.close();
	}

}
