package Collections;

import java.util.LinkedList;
import java.util.Queue;

//FIFO (First-In-First-Out)
//Queues are a linear list where items are added to one end and deleted the other end
//An example of this would be waiting in line at a sporting event
//People join the queue at the end and exit from the front
//Another example is a print que for a printer

//add() - adds elements to the end
//peek() - returns a copy of first element
//remove() - removes top element - returns error if empty
//poll() - removes the top, returns null if the queue is empty
public class QueuePractice {

	public static void main(String[] args) {
			Queue<Integer> queue = new LinkedList<>();
			//adding some numbers to the queue
			for (int i = 1; i <= 10; i++) {
				queue.add(i);
			}
			//print out the queue
			System.out.println("Element in the queue " + queue);
			//remove the first item (1) from the queue
			int removed = queue.remove();
			System.out.println(removed + " was removed");
			//peek into the first new element in the queue
			System.out.println("top element is now: " + queue.peek());
	}
}
