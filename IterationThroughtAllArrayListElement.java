//2.	Write a Java program to iterate through all elements in an array list.

package CollectionPrograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterationThroughtAllArrayListElement {

	public static void main(String[] args) {
		
		ArrayList<Double> list = new ArrayList<Double>();
		list.addAll(List.of(10.1, 10.2, 10.3, 10.4, 10.5, 10.6, 10.7, 10.8, 10.9));
		
		Iterator<Double> itr = list.iterator();
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(itr.next());
		}
		
		//Sum of All List Element
		Double sum=0.0;
		
		for(int i =0;i<list.size();i++)
		{
			sum = sum + list.get(i);
		}
		System.out.println("Sum of All List Element is :"+sum);

	}

}
