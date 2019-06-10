package Lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperators {

	public static void main(String[] args) {
		
		/**
		 * UnaryOperator Interface represents a function which takes in 
		 * 1 argument and operates on it. However, what distinguishes
		 * it from a normal function is that both it's argument and return 
		 * type are the same.
		 * 
		 * Lambda expression assigned to an object of UnaryOperator type is 
		 * used to define it's accept() which eventually applies the given
		 * operation on it's argument.
		 * 
		 * UnaryOperator interface consists of the following functions:
		 */
		
		
		/*
		 * identity()
		 * This method returns a UnaryOperator which takes in one value
		 * and returns it. The returned UnaryOperator does not perform any
		 * operation on its only value.
		 */
		
		UnaryOperator<Boolean> op = UnaryOperator.identity();
		
		System.out.println(op.apply(true));
		
	
		/*
		 * accept()
		 * 
		 */
		
		UnaryOperator<Integer> xor = a -> a ^ 1;
		System.out.println(xor.apply(2));
		
		
		/*
		 * andThen()
		 */
		
		UnaryOperator<Integer> and = a -> a & 1;
		
		Function<Integer, Integer> compose = xor.andThen(and);
		System.out.println(compose.apply(2));
		
		
		
		/*
		 * ANOTHER EXAMPLE
		 */
		
		UnaryOperator<String> extensionAdder = (text) -> { return text + ".txt";};
		
		String newText = extensionAdder.apply("example-function");
		System.out.println(newText);
	
	}
	
		
		
		
	}

