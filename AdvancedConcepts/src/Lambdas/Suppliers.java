package Lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Suppliers {

	public static void main(String[] args) {
		
		/**
		 * The supplier interface represents a function which does not take
		 * in any argument, but produces a value of type T.
		 * 
		 * The lambda expression assign to an object of Supplier type is used
		 * to define it's get() which eventually produces a value.
		 * Suppliers are useful when you don't need to supply any value and
		 * need to obtain a result at the same time.
		 * 
		 * Supplier interface consists of only 1 function: get()
		 */
		
		Supplier<Double> randomValue = () -> Math.random();
		
		System.out.println(randomValue.get());
		
		
		List<String> names = Arrays.asList("Brandon", "Brad", "Shelly", "Madeline");
		//here we use lambda to call our supplier method
		names.stream().forEach((item) -> {
			printNames(()->item);
		});
	
	}
	
	//here we have a method which takes in a supplier argument
	private static void printNames(Supplier<String> supplier) {
		System.out.println(supplier.get());
	}
}
