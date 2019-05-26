package Collections;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;



public class IteratorExample {

	public static void main(String[] args) {
		//here is a collection that we create
		Collection collection = Arrays.asList("red", "orange", "yellow", "green",
				"blue", "indigo", "violet");
		
		//here we create an object of type iterator
		Iterator iterator = collection.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
