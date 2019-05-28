package SubstitutionPrinciple;

import java.util.List;

public class Main {

	// The substitution priciple: if you have a variable of a given type, you
	// can assign it to a value that is a subtype of that type
	public static void main(String[] args) {
		// here we are creating a building object
		Building building = new Building();
		// here we create an office object (subtype of Building)
		Office office = new Office();

		// notice that we are able to use office in the build method
		// this is due to the substitution priciple. Office is a subtype of
		// building
		build(building);
		build(office);

		// Although the substitution priciple works in the code above, it
		// doesn't apply to all scenarios
		// If you look at printBuildings method, it takes a list collection of
		// type Building
		// in this particular case, if you were to pass in an office typed-list
		// into this method,
		// the compiler would throw an error letting you know that the type is
		// incompatible with the method
		
		//The substitution priciple does not apply to types of lists.
	}

	public static void build(Building building) {
		System.out.println("Constructing a new " + building.toString());
	}

	static void printBuildings(List<Building> buildings) {
		for (int i = 0; i < buildings.size(); i++) {
			System.out.println(i + 1 + ": " + buildings.get(i).toString());
		}
	}
}
