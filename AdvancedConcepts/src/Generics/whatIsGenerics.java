package Generics;

import java.util.ArrayList;
import java.util.List;

public class whatIsGenerics {

	// Generics are a way to tell the compiler what type of object a collection
	// can contain
	// In this particular class, you will see two blocks of code. They both do
	// the EXACT same thing
	public static void main(String[] args) {

		// the difference is that in this first block, we are NOT using generics.
		//Notice that we initialized a List collection called names and didn't specify
		//the datatype that it would be using.
		// Once we assign the name String variable to a position in the list, we have to cast it
		//due to the list not being defined a generic type.
		List names = new ArrayList();
		names.add("Laura");
		String name = (String) names.get(0);
		System.out.println("First name: " + name);

		// In this second block of code, there is no need to cast the string variable to a String
		// We already took care of that by defining the List collection to utilize
		//generics type "<String>"
		List<String> names2 = new ArrayList();
		names2.add("Kelly");
		String name2 = names2.get(0);
		System.out.println("First name: " + name2);
	}
}
