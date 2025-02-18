package Collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListPractice {

	// access of elements is linear
	// linked lists are bi-directional
	// all elements in the linked list are 'linked' together in a sequential
	// order

	// linked lists are useful when you know that you are going to be adding
	// elements to the middle or the end of the list. It takes alot less effort
	// (compared to an arraylist)
	public static void main(String[] args) {
		LinkedList states = new LinkedList();
		states.add("Alaska");
		states.add("Arizona");
		states.add("California");
		states.add("Pennsyvania");
		// texas points to null
		states.add("Texas");
		// adds to first index position
		states.addFirst("Alabama");

		System.out.println(states);
		// get the last item in the linked list
		System.out.println("last state in my list = " + states.getLast());

		// this will start iterating backwards from the last item in the linked
		// list
		ListIterator iterator = states.listIterator(states.size());
		while (iterator.hasPrevious()) {
			System.out.println(iterator.previous());

		}

	}
}
