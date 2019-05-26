package Collections;

import java.util.Arrays;import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Lists {

	public static void main(String[] args) {
		
		List<Integer> list1 = Arrays.asList(1, 1, 2, 3, 5, 8, 13, 21, 34, 55);
		//this give the particular index position of something in the list
		System.out.println("position of 21: " + Collections.binarySearch(list1, 21));
		//getting min of list
		System.out.println(Collections.min(list1));
		//max of list
		System.out.println(Collections.max(list1));
	}
}
