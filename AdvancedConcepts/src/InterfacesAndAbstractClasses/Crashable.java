package InterfacesAndAbstractClasses;

//here we have an abstract class
//this class is meant TO BE INHERITED NOT INSTANTIATED INTO AN OBJECT
//you have the ability to create both concrete and abstract methods in the class
//the methods that are abstract have to be public and used in the classes that inherit this class
//concrete methods you do not have to use if you dont want
public abstract class Crashable {

	boolean carDrivable = true;
	
	
	public void youCrashed() {
		this.carDrivable = false;
	}
	
	public abstract void setCarStrength(int strength);
	
	public abstract int getCarStrength();
}
