package Lambdas;

import java.util.function.BinaryOperator;

public class BinaryOperators {

	public static void main(String[] args) {
		
		/**
		 * BinaryOperator interface represents a binary operator which
		 * takes two opperands and operates on them to produce a result.
		 * However, what distinguishes it from a normal BiFunction is that both
		 * of it's arguments and it's return type are the same.
		 * 
		 * Lambda expression assigned to an object of BinaryOperator type
		 * is used to define it's apply() which eventually applies to the 
		 * given operation on it's arguments.
		 */
		
		BinaryOperator<Integer> getSum = (a,b) -> a + b;
		BinaryOperator<Integer> getDifference = (a,b) -> a-b;
		BinaryOperator<Integer> getProduct = (a,b) -> a*b;
		
		Integer sum = getSum.apply(2, 3);
		System.out.println("Sum: " + sum);
		
		Integer difference = getDifference.apply(10, 1);
		System.out.println("Difference: " + difference);
		
		Integer product = getProduct.apply(2, 10);
		System.out.println("Product: " + product);
		
		
		
		
	}
}
