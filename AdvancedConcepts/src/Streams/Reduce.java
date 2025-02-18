package Streams;

import java.util.Arrays;

public class Reduce {
	
	
	/*
	 * A Reduction operation is one which allows you to computer a result using
	 * all the elements present in a stream. Reduction operations are also called
	 * terminal operations because they are always at the end of a chain of Stream 
	 * methods. 
	 * 
	 * Java 8 includes several reduction methods such as:
	 * sum, average, and count, which allow you to perform arithmetic operations
	 * on Stream objects and get numbers as results. 
	 *
	 */

	public static void main(String[] args) {
		
		/**
		 * Example 1: You want to find the sum of an array of integers
		 */
		int myArray[] = {1, 5, 8};
		int sum = Arrays.stream(myArray).sum();
		System.out.println(sum);
		
		
	/*
	 * If you want to peforma more complex reduction operations, however, you must
	 * use the reduce method. Unlike map and filter methods, the reduce method expects
	 * two arguments: an identity element, and a lambda expression.
	 * 
	 * You can think of the 'identity element' as an element which does not alter
	 * the result of the reduction operation. For example, if you are trying to find
	 * the product of all the elements in a stream of numbers, the identity element would 
	 * be the number 1.
	 * 
	 * The Lambda expression you pass to the reduce method must be capable of handling two inputs:
	 * a partial result of the reduction operation, and the current element of the stream.
	 * If you are wondering what a partial result is, it's the result obtained after processing
	 * all the elements of the stream that came before the current element.
	 */
		
		/**
		 * Example 2: Uses the reduce method to concatenate all the eleemnts in an array of strings
		 */
		
		String myArray2[] = {"this", "is", "a", "sentence"};
		//here we are concatenating all elements in the string array
		String result = Arrays.stream(myArray2).reduce("", (a, b) -> a + b);
		
		System.out.println(result);
		
		
	}
}
