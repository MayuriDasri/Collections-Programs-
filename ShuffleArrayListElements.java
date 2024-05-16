////Write a Java program to shuffle elements in an array list.
package CollectionPrograms;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ShuffleArrayListElements {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.addAll(List.of(1,2,3,4,5,6,7,8,9,10));
		System.out.println("List Before Shuffle :"+ list);
		
		Collections.shuffle(list);
		System.out.println("List After Shuffling : "+list);
		
		Random random = new Random();
		Collections.shuffle(list, random);
		System.out.println("List After Shuffling in random way: "+list);
	}

}
