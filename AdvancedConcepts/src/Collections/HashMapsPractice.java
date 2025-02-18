package Collections;

import java.util.HashMap;

public class HashMapsPractice {

	//Hashmaps allow you to store pairs of values together
	
	//ex. Phonebook - contacts = key, phonenumber = value
	
	public static void main(String[] args) {
		
		//here we initialize our Hashmap collection
		HashMap<String, Integer> phonebook = new HashMap<>();
		phonebook.put("Kevin", 1234533);
		phonebook.put("Brandon", 8293638);
		phonebook.put("tyler", 2345234);
		phonebook.put("tyler", 222222);
		//you will notice that when we print out the hashmap, nothing is ordered
		//hashmaps are not ordered
		//additionally, hashmaps do not allow duplicates
		//so in this case, 222222 would be overwritting the previous value
		//for tyler
		
		if (phonebook.containsKey("Brandon")) {
			phonebook.remove("Brandon");
		}
		
		//to remove everything from the hashmap
		phonebook.clear();
		
		System.out.println(phonebook);
	}
}
