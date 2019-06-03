package Streams;

import java.util.Arrays;
import java.util.List;

public class Sorting {

	public static void main(String[] args) {
		
		/*
		 * Stream sorted() returns a stream consisting of the elements
		 * of this stream, sorted according to natural order. For ordered
		 * streams, the sort method is stable but for unordered streams,
		 * no stability is guarenteed. It is a STATEFUL INTERMEDIATE
		 * OPERATION i.e., it may incorporate state from previously-seen elements
		 * when processing new elements.
		 */
		
		/**
		 * Example 1: Get a stream of elements in their natural order
		 */
		 List<Integer> list = Arrays.asList(-9, -18, 0, 25, 4); 
		 //here we use '.sorted()' to get a stream with elements in 
		 //natural order.
		 list.stream().sorted().forEach(System.out::println);
		
		
		 System.out.println("++++++++++++++++++++++++++++++++++++++");
		 System.out.println("++++++++++++++++++++++++++++++++++++++");
		 
		 /**
		  * Printing strings in their natural order
		  */
		 
		 List<String> stringsList = Arrays.asList("Geeks", "for", 
                 "GeeksQuiz", "GeeksforGeeks", "GFG");
		 
		 stringsList.stream().sorted().forEach(System.out::println);
		 
	}
}
