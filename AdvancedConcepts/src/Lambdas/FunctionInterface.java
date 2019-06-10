package Lambdas;

import java.util.function.Function;

public class FunctionInterface {

	public static void main(String[] args) {
		
		/**
		 * Function Interface represents a function which takes in one 
		 * argument and produces a result.
		 * This functional interface takes in 2 generics, namely:
		 * T: denotes the type of the input argument
		 * R: denotes the return type of the function
		 * 
		 * The lambda expression assigned to an object of Function type
		 * is used to define it's apply() which eventually applies the given function on the
		 * argument.
		 */
		
		
		//example of apply()
		
		Function<Integer, Double> half = a -> a / 2.0;
		
		System.out.println(half.apply(10));
		
		
		//example of andThen()
		
		half = half.andThen(a -> 3 * a);
		
		System.out.println(half.apply(10));
		
		//example of compose()
		//This returns a composed function wherein the parameterized function
		//will be executed first  and the nthe first one. If evaluation of either
		//function throws an error, it is relayed to the caller of the composed function
		
		
	}
}
