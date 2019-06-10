package Lambdas;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;

public class BinaryOperatorMethodExample {

	public static void main(String[] args) {
		
		
		Person person1 = new Person("Brandon", 29);
		Person person2 = new Person("Effrosini", 27);
		
		Person result = getYoungerPerson.apply(person1,person2);
		
		System.out.println("Younger person: " + result.getName());
	}
	
	static BinaryOperator<Person> getYoungerPerson = (person1,person2) -> {
		if(person1!=null && person2 != null) {
			if(person1.getAge()>person2.getAge()) {
				return person2;
			}
			else
			{
				return person1;
			}
		}
		return null;
	};
}
