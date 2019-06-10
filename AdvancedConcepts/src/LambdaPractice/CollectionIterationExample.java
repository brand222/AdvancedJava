package LambdaPractice;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import Lambdas.Person;

public class CollectionIterationExample {

	public static void main(String[] args) {
		
		Predicate<Person> isYoung = (p) -> p.getAge() < 25;
		
		List<Person> people = Arrays.asList(
				new Person("Tom", 26),
				new Person("Brandon", 29),
				new Person("Tim", 23), 
				new Person("Jimmy", 19), 
				new Person("Parker", 20)
				);
		System.out.println("Using for loop");
		for (int i = 0; i < people.size(); i++) {
			System.out.println(people.get(i));
		}
		System.out.println("Using for each loop");
		for (Person i : people) {
			System.out.println(i);
		}
		System.out.println("++++++++++++++++++++");
		//System.out.println("Using foreach lambda");
		
		//people.forEach(i -> System.out.println(i.getName()));
		
		List<Person> newList = processListForYoung(people, isYoung);
		
		newList.stream().map(i -> i.getName()).forEach(System.out::println);
						
	}
	//here we have a method that filters by people who have an age less than 25
	static List<Person> processListForYoung(List<Person> list, Predicate<Person> isYoung) {
			return list.stream().filter(isYoung).collect(Collectors.toList());
	}
}
