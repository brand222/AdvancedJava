package Streams;

import java.util.Arrays;
import java.util.List;

public class MiscExamples2 {

	public static void main(String[] args) {
		
		/**
		 * Here is an example of a method reference being used
		 * inside of a stream filter
		 */
		
		List<String> fruits = Arrays.asList("Apple", "Bananna", "Cherry", "Orange");

		fruits
		.stream()
		.filter(MiscExamples2::isNotOrange)
		.filter(MiscExamples2::isNotCherry)
		.forEach(System.out::println);
		
	}
	
	private static boolean isNotOrange(String fruit) {
		return !fruit.equalsIgnoreCase("Orange");
	}
	
	private static boolean isNotCherry(String fruit) {
		return !fruit.equalsIgnoreCase("Cherry");
	}
}
