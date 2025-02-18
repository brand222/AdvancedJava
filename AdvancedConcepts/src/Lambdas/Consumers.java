package Lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumers {

	public static void main(String[] args) {
		
		/**
		 * The CONSUMER interface is a part of the java.util.function package.
		 * Consumers represent a function which takes in one argument and produces 
		 * a result. However, these kinds of functions don't return any value.
		 * 
		 * 
		 * The lambda expression assigned to an object of Consumer type is used to
		 * define it's accept() which eventually applies the given operation to it's argument
		 * Consumers are useful when you do not need to return any value as they are expected to
		 * operate via side-effects.
		 * 
		 * The Consumer interfa consists of two methods: accept() and andThen()
		 */
		
		 // Consumer to display a number 
        Consumer<Integer> display = a -> System.out.println(a); 
  
        // Implement display using accept() 
        display.accept(10); 
        display.accept(14);
        
        
        // Consumer to multiply 2 to every integer of a list 
        Consumer<List<Integer> > modify = list -> 
        { 
            for (int i = 0; i < list.size(); i++) 
                list.set(i, 2 * list.get(i)); 
        }; 
        
        
        Consumer<List<Integer>> displayList = list -> list.stream().forEach(System.out::println);
        
        List<Integer> newList = Arrays.asList(1,2,3,4,5);
        
       displayList.accept(newList);
       
       
       //here, we are both modifying the list and diplaying it
       //as you can see, we are utilizing the andThen() command
       
       List<Integer> newList2 = Arrays.asList(2,4,6,8,10,12,14,16,18);
       //modify the list, "andThen" display it
       modify.andThen(displayList).accept(newList2);
		
	}
}
