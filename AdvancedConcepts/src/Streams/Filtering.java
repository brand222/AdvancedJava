package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Filtering {

	/*
	 * Stream filter (Predicate predicate) returns a stream consisting of the
	 * elements of this stream that match the given predicate. This is an
	 * INTERMEDIATE OPERATION. These operations are always lazy i.e., executing
	 * an intermediate operation such as 'filter()' does not actually perform
	 * any filtering, but instead creates a new stream that, when traversed,
	 * contains the elements of the initial stream that match the given
	 * predicate.
	 */

	public static void main(String[] args) {

		/**
		 * Example 1: filter() method with operation of filtering out the
		 * elements divisible by 5
		 **/
		// create a list of integers
		List<Integer> numberList = Arrays.asList(3, 4, 6, 12, 20);
		// using Stream filter (Predicate predicate)
		// to get a stream consisting of the elements
		// that are divisible by 5
		numberList.stream().filter(num -> num % 5 == 0).forEach(System.out::println);
		
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++");
		/**
		 * Example 2: filter() method with operation of filtering out the
		 * elements with upperCase letter at index 1
		 */
		// Creating a Stream of Strings
		Stream<String> stream = Stream.of("Geeks", "fOr", "GEEKSQUIZ", "geeksforGeeks");
		//Using Stream filter to get a stream consisting of the elements
		//having UpperCase Character at index 1
		stream.filter(str -> Character.isUpperCase(str.charAt(1))).forEach(System.out::println);

		

		System.out.println("++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++");
		
		/**
		/**
		 * Example 3: filter() method with operation of filtering out the elements ending with s.
		 */
		
		 // Creating a Stream of Strings 
        Stream<String> stream2 = Stream.of("Geeks", "foR", 
                                          "GeEksQuiz", "GeeksforGeeks"); 
        //Using Stream filter to get a stream consisting of elements
        //ending with 's'
        stream2.filter(str -> str.endsWith("s")).forEach(System.out::println);
        
	}
}
