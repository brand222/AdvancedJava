package Inheritance;

public class MainClass {
 
	public static void main(String[] args) {
		
		Animals genericAnimal = new Animals();
		
//		System.out.println(genericAnimal.getName());
//		System.out.println(genericAnimal.favFood);
		
		//here we create a new cat object
		Cat cat = new Cat("Billy", "Tuna", "Rubber Mouse");
		
		System.out.println(cat.getToy());
		
		System.out.println(cat.getName());
		
		System.out.println(cat.favFood);
		//here we create a new animal of type cat
		Animals tabby = new Cat("tabby", "pizza", "mom's dildo");
		
		acceptAnimal(tabby);
	}
	
	//this method is an ideal example of polymorphism
	//the java compiler is smart enough to determine that the animals
	//which we passed into this method on line 22, is (in fact) a cat
	public static void acceptAnimal(Animals animal) {
		System.out.println(animal.getName());
		System.out.println(animal.favFood);
		System.out.println();
		animal.walkAround();
	}
}
