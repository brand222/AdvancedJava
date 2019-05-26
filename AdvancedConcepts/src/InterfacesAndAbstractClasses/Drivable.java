package InterfacesAndAbstractClasses;

//This class is an interface. It is an empty class that tells the user what methods they MUST implement 
// you can put fields in an interface, but they are final (they wont change). Everything in this interface
//class is considered to be abstract by default
public interface Drivable {

	double PI = 3.14;
	
	//by default, it is public abstract
	int getWheel();
	
	void setWheels(int numWheels);
	
	double getSpeed();
	
	void setSpeed(double speed);
	
}
