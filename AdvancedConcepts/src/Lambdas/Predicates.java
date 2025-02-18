package Lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Predicates {

	public static void main(String[] args) {

		/**
		 * A predicate in general means a statement about something is either
		 * true or false. In programming, a predicate represents a single
		 * argument function that returns a boolean value that can typically
		 * be passed into something (streams)
		 * 
		 * Predicates in java are implemented with interfaces
		 */

		/*
		 * here we are creating a predicate which checks if a string has a length
		 * of greater than 6.
		 */
		Predicate<String> stringLen = (s) -> s.length() > 6;
		//print out the result
		System.out.println(stringLen.test("Apples") + " - Apples is less than 6");
		System.out.println();
		
		
		// here we have a list of names
		List<String> names = Arrays.asList("Brandon", "Henderson", "Thompson", "Alexanders", "Tom", "Billy");
		
		
		//now we can re-use our predicate to filter out names which are not greater than 6.
		List<String> names2 = names.stream()
				.filter(stringLen)
				.collect(Collectors.toList());
		//print out result
		names2.forEach(System.out::println);
		System.out.println();
		
		//now we can do the opposite
		//By using the 'negate()' method, we are finding everything which is NOT > 6 length
		List<String> names3 = names.stream()
				.filter(stringLen.negate())
				.collect(Collectors.toList());
		
		//print out result
		names3.forEach(System.out::println);
		
		

		
		
		/**
		 * IntPredicate represents a predicate of one int-valued argument.
		 * This is the int-consuming primitive type specialization of Predicate<E>
		 */

		int[] nums = {2,4,5, 5, 5, 5, 5,5, 5,5, 6,7,8,8,8,8,8,9,10};
		//here is our intPredicate (looking for nums = 5)
		IntPredicate p = (n) -> n == 5;
		//here we print out everything fitting the predicate criteria
		Arrays.stream(nums).filter(p).forEach(System.out::println);
		System.out.println("+++++++++++");
		/**
		 * In addition, we can use mulitple predicates inside of filter()
		 * by the use of 'or()'
		 */
		//here we have added an additional predicate
		IntPredicate j = (n) -> n == 8;
		//here we are using the 'or()' operator inside of filter to 
		//indicate we are returning a stream of elements equal to 5 OR 8
		Arrays.stream(nums).filter(p.or(j)).forEach(System.out::println);
		
		
	}
	
	

}
