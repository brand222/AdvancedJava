package Generics;

import java.util.ArrayList;
import java.util.List;

//Generic methods are methods that allow you to create a new type parameter just for that method

//This is useful when you want to create a method and be flexible about the type of objects you want to pass in

public class GenericMethods {

	// here we have created a few different arrays
	static Character[] charArray = { 'h', 'e', 'l', 'l', 'o' };
	static Integer[] intArray = { 1, 2, 3, 4, 5 };
	static Boolean[] boolArray = { true, false, true };

	// this method converts an array to a list by iterating through all the
	// objects of an array and adds them to a list
	// then returns that newly-created list

	/*
	 * You will notice for this particular method, we are using 'Object[]' (in
	 * place of T originally) as a parameter This allows us to utilize object so
	 * you can pass in arrays or lists of any type to this method Object is a
	 * parent type of all other object types.
	 */
	public static <T> List<T> arrayToList(T[] array, List<T> list) {
		for (T object : array) {
			list.add(object);
		}
		return list;
	}

	public static void main(String[] args) {
		// initialize your Lists
		List<Character> charList = arrayToList(charArray, new ArrayList<>());
		List<Boolean> boolList = arrayToList(boolArray, new ArrayList<>());
		List<Integer> intList = arrayToList(intArray, new ArrayList<>());

		// however, there is a downside to using Object.
		// Using object, mean you are losing type-safety. In other words, you
		// are not notified as easily about casting issues etc...
		// for example: we are allowed (until runtime) to convert an int array
		// to a String list
		// once you run this particular code, you will get a runtime error
		// (ClassCastException)
		// List<String> intList2 = arrayToList(intArray, new ArrayList<>());
		// System.out.println(intList2.get(0));

		// in order to avoid these issue, we need to use Generics in our method
		//<T> 

	}
}
