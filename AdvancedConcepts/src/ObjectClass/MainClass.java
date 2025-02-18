package ObjectClass;

import InterfacesAndAbstractClasses.Vehicle;

/*
 * Every object you ever create, inherits all methods from a class called "object class"
 * 
 */
public class MainClass {

	public static void main(String[] args) {
		//here we are creating an object of type vehicle
		Object superCar = new Vehicle();
		
		//in order for us to get access to methods of Vehicle, we have to CAST it as type vehicle
		System.out.println(((Vehicle)superCar).getSpeed());
		
		
		Vehicle superTruck = new Vehicle();
		
		//.equals compares two objects
		System.out.println(superCar.equals(superTruck));
		
		//find object's hashcode
		System.out.println(superCar.hashCode());
		
		//getClass method prints out class for the object
		System.out.println(superCar.getClass());
		
		//get name of the object class
		System.out.println(superCar.getClass().getName());
		
		//comparing an objects classes
		if(superCar.getClass() == superTruck.getClass()) {
			System.out.println("The same");
		}
		//prints an object's superclass
		System.out.println(superCar.getClass().getSuperclass());
		
		
	}
}
