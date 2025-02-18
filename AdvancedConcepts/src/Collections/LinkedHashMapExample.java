package Collections;

import java.util.LinkedHashMap;
import java.util.Map;

/*
 * When using a normal hashmap thers is no guarentee you can get the objects back in the same order you
 * put htem in. When using linked hashmaps, the order is retained.
 */
public class LinkedHashMapExample {

	public static void main(String[] args) {
		
		LinkedHashMap<String, Integer> phonebook = new LinkedHashMap(4, 0.75f, false);
		phonebook.put("Kevin", 1111111);
		phonebook.put("Anna", 2222222);
		phonebook.put("Tom", 3333333);
		phonebook.put("Brandon", 9999999);
		
		
		System.out.println("Kevin's number: " + phonebook.get("Kevin"));
		
		System.out.println("\nList of contacts in phonebook");
		for(Map.Entry<String, Integer> entry : phonebook.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}
}
