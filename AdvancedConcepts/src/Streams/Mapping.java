package Streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Mapping {

	/*
	 * Stream map(Function mapper) returns a stream consisting of the results of applying the 
	 * given function to the elements of this stream.
	 * 
	 * Stream map (Function mapper) is an INTERMEDIATE OPERATION. These operations are always lazy. 
	 * Intermediate operations are invoked on a Stream instance and after they finish their
	 * processing, they give a Stream instance as output.
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		
		/** Example 1: Stream map() function with operation of number * number on each 
		 * element of stream **/
		
		List<Integer> numberList = Arrays.asList(2,3,4,5,6,7);
		//here we are using map() to square each number and print out each squared number
		numberList.stream().map(x -> x * x).forEach(System.out::println);
		//alternatively, you can print using lambda instead of method referencer
		//numberList.stream().map(x-> x*x).forEach(x -> System.out.println(x));
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++");
		 
		
		
		/** Example 2:  Stream map() function with operation of converting 
		 * lowercase to uppercase**/
		//here we have a string list 
		List<String> stringList = Arrays.asList("geeks", "Brandon", "gfg", "g", "e");
		//here we are creating a new list.
		//You will notice that we are using String::toUpperCase using the '::' method referencer
		//this takes all strings inside of the string list and puts them to upper case
		List<String> answer = stringList.stream().map(String::toUpperCase).collect(Collectors.toList());
		//here we print our result
		System.out.println(answer);
		
		
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++");
		
		/**
//		 * Example 3: Stream map() function with operation of mapping string length in place of string
		 **/
		//list of strings
		 List<String> stringList2 = Arrays.asList("Geeks", "FOR", "GEEKSQUIZ", 
                 "Computer", "Science", "gfg"); 
		 //here we are printing out the length of each string
		 //you can see in our map method that we are getting the length of each string
		 //and then printing them out
		 stringList2.stream().map(str -> str.length()).forEach(System.out::println);
		 
		
	}
	}

