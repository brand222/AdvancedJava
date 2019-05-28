package WildCards;

import java.util.ArrayList;
import java.util.List;

public class Main {

	// wildcards is an unknown type and gives you more flexibility when writing
	// methods
	// House and Office extend the House class

	public static void main(String[] args) {

		//creating a list of buildings
		List<Building> buildings = new ArrayList();
		buildings.add(new Building());
		buildings.add(new Building());
		printBuildings(buildings);

		//creating a list of offices
		List<Office> offices = new ArrayList();
		offices.add(new Office());
		offices.add(new Office());
		printBuildings(offices);

		//creating a list of houses
		List<House> houses = new ArrayList();
		houses.add(new House());
		houses.add(new House());
		printBuildings(houses);
	}

	// this print buildings method originally passed in an object of type
	// buildings
	// however, since the substitution principle does not apply to list
	// collections,
	// if we passed in House or Office types into this method, it would throw a
	// compiler
	// errors on lines 23 and 28 where this method is called saying that 
	//Lists of Type house and office are not subtypes of List<Building>

	// We need to update this method to accept any object type that INHERITS
	// FROM BUILDING (extends building)
	// This is done with the question mark and an 'extends' keyword

	// List<? extends Building> = Accept a list as a parameter of any type which
	// inherits (extends) from Building
	
	//this is an in-variable
	static void printBuildings(List<? extends Building> buildings) {
		for (int i = 0; i < buildings.size(); i++) {
			System.out.println(buildings.get(i).toString() + " " + (i + 1));
		}
		System.out.println();
	}

	//here we are applying the same idea, but backwards.
	//instead of referencing any subclass List type
	//we are now specifying the SuperType of house (Building)
	
	//This is an out-variable
	static void addHouseToList(List<? super House> buildings) {
		buildings.add(new House());
		System.out.println();
	}

}
