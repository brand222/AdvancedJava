package Inheritance;

//'extends' means cat will inherit the fields and methods of Animals class
public class Cat extends Animals{

	//create some behaviors of a cat
	public String favToy = "Yarn";
	
	public void playWith() {
		System.out.println("Yay" + favToy);
	}
	
	public void walkAround() {
		System.out.println(this.getName() + " creeps around");
	}
	
	public Cat(String name, String favFood, String favToy) {
		super(name, favFood);
		this.favToy = favToy;
	}
	
	public String getToy() {
		return this.favToy;
	}
	
	
	
	public Cat() {
		
	}
}
