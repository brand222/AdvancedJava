package Inheritance;
//this is our superclass (we will have subclasses that inherit from this class)
public class Animals {
	//the only thing that has access to this variable the animals class
	private String name = "Animal";
	//any class can access this variable
	public String favFood = "Food";
	
	//this variable cannot be overrided by a subclass (it's 'final')
	protected final void changeName(String newname) {
		this.name = newname;
	}
	
	protected final String getName() {
		return this.name;
	}
	
	public void eatStuff() {
		System.out.println("Yum!" + favFood);
		
	}
	
	public void walkAround() {
		System.out.println(this.name + " walks around");
	}
	
	public Animals() {
		
	}
	
	public Animals(String name, String favFood) {
		this.changeName(name);
		this.favFood = favFood;
	}
}
