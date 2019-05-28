package Generics;

public class Varargs {

	public static void main(String[] args) {
		String item1 = "Apples";
		String item2 = "Oranges";
		String item3 = "Pears";
		String[] shopping = { "Bread", "Milk", "Eggs", "Bananas" };

		printShoppingList(item1, item2, item3);
		printShoppingList(shopping);
	}

	// public static void printShoppingList(String string1, String string2) {
	// System.out.println("SHOPPING LIST");
	// System.out.println("1. " + string1);
	// System.out.println("2. " + string2);
	// }
	//
	// public static void printShoppingList(String string1, String string2,
	// String string3) {
	// System.out.println("SHOPPING LIST");
	// System.out.println("1. " + string1);
	// System.out.println("2. " + string2);
	// System.out.println("3. " + string3);
	// }
	//
	// public static void printShoppingList(String[] stringArray) {
	// System.out.println("SHOPPING LIST");
	// int num = 1;
	// for (String i : stringArray) {
	// System.out.println(num + ". " + i);
	// num++;
	// }
	// }

	// in the previous 3 methods, they all are ultimately accomplishing the same
	// thing:
	// printing out a shopping list, the only difference between them is the
	// arguments that are being passed.
	// One method is overridden and the other takes an array as a parameter

	// you will notice that the method below has '...' in the method parameter
	// section
	// these dots basically mean that this method can take a variable amount of
	// arguments (of type string)
	//with these 3 dots, this means i can pass in, 1 item, 2 items, no items, or an array of items
	//thus, this replaces all the three previous methods and saves alot of lines of code.
	public static void printShoppingList(String... stringArray) {
		System.out.println("SHOPPING LIST");
		int num = 1;
		for (String i : stringArray) {
			System.out.println(num + "." + i);
			num++;
		}
	}

}
